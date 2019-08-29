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

Mobile.tap(findTestObject('0405_Seller/040504_TransaksiPenjualan/btnSearchTransaksiPenjualan'), 0)

Mobile.setText(findTestObject('0405_Seller/040504_TransaksiPenjualan/txtBoxCariNomorPesanan'), GlobalVariable.OrderNumberTransaksiPenjualan4Chacacter,
	0)

WebUI.callTestCase(findTestCase('HideKeyboardByTap'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

height = Mobile.getDeviceHeight()

width = Mobile.getDeviceWidth()

int a = width / 2

int b = height -100

int c = a

int d = 0

Mobile.swipe(a, b, c, d)