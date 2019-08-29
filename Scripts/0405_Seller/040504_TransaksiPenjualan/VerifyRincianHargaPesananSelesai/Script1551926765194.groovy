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

height = Mobile.getDeviceHeight()

width = Mobile.getDeviceWidth()

int a = width / 2

int b = height - 100

int c = a

int d = height - 300

Mobile.swipe(a, b, c, d)

Mobile.verifyElementExist(findTestObject('0405_Seller/040504_TransaksiPenjualan/labelSubtotalProduk'), 0)

Mobile.verifyElementExist(findTestObject('0405_Seller/040504_TransaksiPenjualan/labelBiayaPengirimanRincianHarga'), 0)

try {
    Mobile.verifyElementExist(findTestObject('0405_Seller/040504_TransaksiPenjualan/labelCashback'), 0)
}
catch (Exception e) {
} 

Mobile.verifyElementExist(findTestObject('0405_Seller/040504_TransaksiPenjualan/containerTotalHargaPesananSelesai'), 0)

