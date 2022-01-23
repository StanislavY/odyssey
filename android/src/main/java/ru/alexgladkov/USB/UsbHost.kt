package ru.alexgladkov.USB

import android.content.Context
import android.hardware.usb.*
import android.hardware.usb.UsbConstants.USB_DIR_IN
import androidx.core.content.ContextCompat.getSystemService

class UsbHost {
    /*val usbManager = context.getSystemService(Context.USB_SERVICE) as UsbManager


    private var usbConnection: UsbDeviceConnection? = null
    private var usbInterface: UsbInterface? = null
    private var usbRequest: UsbRequest? = null
    private var usbInEndpoint: UsbEndpoint? = null
    private var usbOutEndpoint: UsbEndpoint? = null

    fun enumerate(): Boolean {
        val deviceList = usbManager.deviceList
        for (device in deviceList.values) {

            *//* Находим девайс девайс с нашими VID и PID *//*
            val VENDOR_ID="10C4"
            val PRODUCT_ID=
            if ((device.vendorId == VENDOR_ID) and (device.productId == PRODUCT_ID)) {

                *//* Получаем интерфейс по известному номер *//*
                usbInterface = device.getInterface(CUSTOM_HID_INTERFACE)

                *//* Перебираем конечные точки интерфейса
                    и находим точки на прием и передачу *//*
                for (idx in 0 until usbInterface!!.endpointCount) {
                    if (usbInterface?.getEndpoint(idx)?.direction == USB_DIR_IN)
                        usbInEndpoint = usbInterface?.getEndpoint(idx)
                    else
                        usbOutEndpoint = usbInterface?.getEndpoint(idx)
                }

                usbConnection = usbManager.openDevice(device)
                usbConnection?.claimInterface(usbInterface, true)

                usbRequest = UsbRequest()
                usbRequest?.initialize(usbConnection, usbInEndpoint)
            }
        }

        *//* Возвращаем статус подключения *//*
        return usbConnection != null
    }*/
}