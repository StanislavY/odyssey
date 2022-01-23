package ru.alexgladkov.odyssey_demo

import android.content.Context
import android.hardware.usb.*
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.alexgladkov.common.compose.NavigationTree
import ru.alexgladkov.common.compose.navigation.buildComposeNavigationGraph
import ru.alexgladkov.odyssey.compose.AndroidScreenHost
import ru.alexgladkov.odyssey.compose.setupActivityWithRootController

public class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var usbConnection: UsbDeviceConnection? = null
        var usbInterface: UsbInterface? = null
        var usbRequest: UsbRequest? = null
        var usbInEndpoint: UsbEndpoint? = null
        var usbOutEndpoint: UsbEndpoint? = null
        val usbManager = getSystemService(Context.USB_SERVICE) as UsbManager

        fun enumerate(): Boolean {
            val deviceList = usbManager.deviceList
            for (device in deviceList.values) {

                /* Находим девайс девайс с нашими VID и PID */
                /* val VENDOR_ID="10C4"
                 val PRODUCT_ID=*/
                /*if ((device.vendorId == VENDOR_ID) and (device.productId == PRODUCT_ID)) {*/

                /* Получаем интерфейс по известному номер */
                usbInterface = device.getInterface(0)

                /* Перебираем конечные точки интерфейса
                    и находим точки на прием и передачу */
                for (idx in 0 until usbInterface!!.endpointCount) {
                    if (usbInterface?.getEndpoint(idx)?.direction == UsbConstants.USB_DIR_IN)
                        usbInEndpoint = usbInterface?.getEndpoint(idx)
                    else
                        usbOutEndpoint = usbInterface?.getEndpoint(idx)
                }

                usbConnection = usbManager.openDevice(device)
                usbConnection?.claimInterface(usbInterface, true)

                usbRequest = UsbRequest()
                usbRequest?.initialize(usbConnection, usbInEndpoint)

            }

            /* Возвращаем статус подключения */
            return usbConnection != null
        }

            enumerate()






        AndroidScreenHost(this)
            .setupActivityWithRootController(
                startScreen = NavigationTree.Root.Splash.toString(),
                block = buildComposeNavigationGraph()
            )









    }
}