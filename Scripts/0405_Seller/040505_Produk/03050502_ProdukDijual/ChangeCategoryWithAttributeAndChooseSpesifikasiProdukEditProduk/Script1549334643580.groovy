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

int d = height / 2

Mobile.swipe(a, b, c, d)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/labelKategoriEditProduk'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/btnFashionCategoryEditProduk'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/btnFashionPriaCategoryEditProduk'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/btnPakaianPriaCategoryEditProduk'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/btnKategoriKaos'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/btnKategoriKaosLenganPanjang'), 0)

Mobile.verifyElementExist(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/btnSpesifikasiEditProduk'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/btnSpesifikasiEditProduk'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/btnJenisPakaianSpesifikasiEditProduk'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/btnJenisPakaianPertamaSpesifikasiEditProduk'), 
    0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/btnBahanSpesifikasiEditProduk'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/btnBahanPertamaEditProduk'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050502_ProdukDijual/btnSimpanSpesifikasiEditProduk'), 0)

WebUI.callTestCase(findTestCase('0405_Seller/040505_Produk/03050502_ProdukDijual/TapSaveButtonEditProduk'), [:], FailureHandling.STOP_ON_FAILURE)

