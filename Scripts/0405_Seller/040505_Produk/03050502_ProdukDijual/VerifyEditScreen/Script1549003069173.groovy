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

Mobile.verifyElementExist(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/imgProdukEditProduk'), 10)

Mobile.verifyElementExist(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/txtBxNamaProdukEditProduk'), 10)

Mobile.verifyElementExist(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/txtBxDeskripsiProdukEditProduk'), 
    10)

height = Mobile.getDeviceHeight()

width = Mobile.getDeviceWidth()

int a = width / 2

int b = height - 100

int c = a

int d = 0

Mobile.swipe(a, b, c, d)

Mobile.swipe(a, b, c, d)

Mobile.verifyElementExist(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/labelKategoriEditProduk'), 10)

Mobile.verifyElementExist(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/txtBxHargaProdukEditProduk'), 
    10)

Mobile.verifyElementExist(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/txtBxHargaDiskonEditProduk'), 
    10)

try {
	Mobile.verifyElementExist(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/txtBxStokEditProduk'), 10)
} catch (Exception e) {
	e.printStackTrace()
}

try {
	Mobile.verifyElementExist(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/txtBxSKUEditProduk'), 10)
} catch (Exception e) {
	e.printStackTrace()
}

Mobile.verifyElementExist(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/btnSimpanProdukDisabledEditProduk'), 
    10)

