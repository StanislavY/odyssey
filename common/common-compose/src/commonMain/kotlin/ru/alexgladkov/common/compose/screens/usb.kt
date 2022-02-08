package ru.alexgladkov.common.compose.screens

/*import android.content.Context
import android.hardware.usb.**/

class usb {
  /*  fun enumerate(): Boolean {
        val usbManager = getSystemService(Context.USB_SERVICE) as UsbManager
        var usbConnection: UsbDeviceConnection? = null
        var usbInterface: UsbInterface? = null
        var usbRequest: UsbRequest? = null
        var usbInEndpoint: UsbEndpoint? = null
        var usbOutEndpoint: UsbEndpoint? = null
        val deviceList = usbManager.deviceList
        for (device in deviceList.values) {

            *//* Находим девайс девайс с нашими VID и PID *//*
            *//* val VENDOR_ID="10C4"
             val PRODUCT_ID=*//*
            *//*if ((device.vendorId == VENDOR_ID) and (device.productId == PRODUCT_ID)) {*//*

            *//* Получаем интерфейс по известному номер *//*
            usbInterface = device.getInterface(0)

            *//* Перебираем конечные точки интерфейса
                и находим точки на прием и передачу *//*
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

        *//* Возвращаем статус подключения *//*
        return usbConnection != null
    }*/
}