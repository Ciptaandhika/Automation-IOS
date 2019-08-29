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

int d = 0

Mobile.delay(10)

Mobile.swipe(a, b, c, d)

Mobile.swipe(a, b, c, d)

Mobile.setText(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/txtBxHargaDiskonEditProduk'), GlobalVariable.DiscountPriceProdukEditProduk, 
    0)

String productDiscount = Mobile.getText(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/txtBxHargaDiskonEditProduk'), 0)

assert productDiscount.indexOf('.') >= 0

WebUI.callTestCase(findTestCase('HideKeyboardByTap'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('0405_Seller/040505_Produk/03050502_ProdukDijual/TapSaveButtonEditProduk'), [:], FailureHandling.STOP_ON_FAILURE)

