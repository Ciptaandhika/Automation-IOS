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

assert Mobile.verifyElementText(findTestObject('0405_Seller/040503_Beranda/labelTransaksiPenjualan'), 'Transaksi Penjualan')

Mobile.tap(findTestObject('0405_Seller/040503_Beranda/labelTransaksiPenjualan'), 0)

Mobile.tap(findTestObject('0405_Seller/040503_Beranda/labelSemua'), 0)

Mobile.tap(findTestObject('0405_Seller/040504_TransaksiPenjualan/btnBackTransaksiPenjualan'), 0)

WebUI.callTestCase(findTestCase('0405_Seller/040503_Beranda/ClickBurgerMenu'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('0405_Seller/040503_Beranda/labelDipesan'), 0)

Mobile.tap(findTestObject('0405_Seller/040504_TransaksiPenjualan/btnBackTransaksiPenjualan'), 0)

WebUI.callTestCase(findTestCase('0405_Seller/040503_Beranda/ClickBurgerMenu'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('0405_Seller/040503_Beranda/labelTelahDibayar (1)'), 0)

Mobile.tap(findTestObject('0405_Seller/040504_TransaksiPenjualan/btnBackTransaksiPenjualan'), 0)

WebUI.callTestCase(findTestCase('0405_Seller/040503_Beranda/ClickBurgerMenu'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('0405_Seller/040503_Beranda/labelTelahDikirim (1)'), 0)

Mobile.tap(findTestObject('0405_Seller/040504_TransaksiPenjualan/btnBackTransaksiPenjualan'), 0)

WebUI.callTestCase(findTestCase('0405_Seller/040503_Beranda/ClickBurgerMenu'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('0405_Seller/040503_Beranda/labelSelesai (1)'), 0)

Mobile.tap(findTestObject('0405_Seller/040504_TransaksiPenjualan/btnBackTransaksiPenjualan'), 0)

WebUI.callTestCase(findTestCase('0405_Seller/040503_Beranda/ClickBurgerMenu'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('0405_Seller/040503_Beranda/labelDibatalkan'), 0)
