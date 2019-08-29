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

Mobile.setText(findTestObject('0405_Seller/040505_Produk/03050502_ProdukDijual/txtBxBeratProdukPengirimanEditProduk'), '1000', 
    0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/03050502_ProdukDijual/btnSatuanBeratPengirimanEditProduk'), 0)

WebUI.callTestCase(findTestCase('SwipePickerDown'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TapDoneSpinner'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('0405_Seller/040505_Produk/03050502_ProdukDijual/txtBxPanjangProdukPengirimanEditProduk'), 
    '5', 0)

Mobile.setText(findTestObject('0405_Seller/040505_Produk/03050502_ProdukDijual/txtBxLebarProdukPengirimanEditProduk'), '10', 
    0)

Mobile.setText(findTestObject('0405_Seller/040505_Produk/03050502_ProdukDijual/txtBxTinggiProdukPengirimanEditProduk'), 
    '60', 0)

Mobile.verifyElementAttributeValue(findTestObject('0405_Seller/040505_Produk/03050502_ProdukDijual/labelHasilKalkulasiPengirimanEditProduk'), 
    'label', 'Total berat pengiriman produk sebesar 1 kg.', 0)

