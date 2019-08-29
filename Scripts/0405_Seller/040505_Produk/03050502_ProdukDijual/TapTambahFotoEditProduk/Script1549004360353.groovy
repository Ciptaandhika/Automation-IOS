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

int x = Mobile.getDeviceWidth() / 2

int y = Mobile.getElementTopPosition(findTestObject('0405_Seller/040504_TransaksiPenjualan/labelFotoProduk'), 0) + 50

Mobile.delay(5)

Mobile.swipe(x, y, x - 100, y)

try {
    Mobile.verifyElementExist(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/btnKameraTambahProduk'), 0)
}
catch (Exception e) {
    Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/labelTambahFotoEditProduk'), 10)
} 

