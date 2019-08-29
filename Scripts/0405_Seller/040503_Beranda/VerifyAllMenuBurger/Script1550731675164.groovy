import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

assert Mobile.verifyElementText(findTestObject('0405_Seller/040503_Beranda/labelBantuan'), 'Bantuan')

assert Mobile.verifyElementText(findTestObject('0405_Seller/040503_Beranda/labelKeluar'), 'Keluar')

assert Mobile.verifyElementText(findTestObject('0405_Seller/040503_Beranda/labelBeranda'), 'Beranda')

assert Mobile.verifyElementText(findTestObject('0405_Seller/040503_Beranda/labelTransaksiPenjualan'), 'Transaksi Penjualan')

Mobile.tap(findTestObject('0405_Seller/040503_Beranda/labelTransaksiPenjualan'), 0)

assert Mobile.verifyElementText(findTestObject('0405_Seller/040503_Beranda/labelSemua'), 'Semua')

assert Mobile.verifyElementText(findTestObject('0405_Seller/040503_Beranda/labelDipesan'), 'Dipesan')

assert Mobile.verifyElementText(findTestObject('0405_Seller/040503_Beranda/labelTelahDibayar (1)'), 'Telah Dibayar')

assert Mobile.verifyElementExist(findTestObject('0405_Seller/040503_Beranda/labelTelahDikirim (1)'), 0)

assert Mobile.verifyElementText(findTestObject('0405_Seller/040503_Beranda/labelSelesai (1)'), 'Selesai')

assert Mobile.verifyElementText(findTestObject('0405_Seller/040503_Beranda/labelDibatalkan'), 'Dibatalkan')

WebUI.callTestCase(findTestCase('SwipeUp'), [:], FailureHandling.STOP_ON_FAILURE)

assert Mobile.verifyElementText(findTestObject('0405_Seller/040503_Beranda/labelProduk'), 'Produk')

Mobile.tap(findTestObject('0405_Seller/040503_Beranda/labelProduk'), 0)

assert Mobile.verifyElementText(findTestObject('0405_Seller/040503_Beranda/labelTambaProduk'), 'Tambah Produk')

assert Mobile.verifyElementText(findTestObject('0405_Seller/040503_Beranda/labelProdukDijual (1)'), 'Produk Dijual')

assert Mobile.verifyElementText(findTestObject('0405_Seller/040503_Beranda/menuProdukTersimpan (1)'), 'Produk Tersimpan')

WebUI.callTestCase(findTestCase('SwipeUp'), [:], FailureHandling.STOP_ON_FAILURE)

assert Mobile.verifyElementText(findTestObject('0405_Seller/040503_Beranda/labelKotakMasuk'), 'Kotak Masuk')



