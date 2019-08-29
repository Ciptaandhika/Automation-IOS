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

Mobile.delay(20)

Mobile.setText(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/txtBoxNamaProduk'), GlobalVariable.NamaProduk, 
    0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/txtBoxHargaProduk'), '990999', 0)

Mobile.setText(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/txtBoxDescProduk'), GlobalVariable.NamaProduk, 
    0)

Mobile.tap(findTestObject('btnKeyboardDone'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/rbBaru'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/btnKategoriTambahProduk'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/btnKategoriFashion'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/btnKategoriFashionPria'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/btnKategoriPakaianPria'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/btnKategoriKaos'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/btnKategoriKaosLenganPanjang'), 0)

height = Mobile.getDeviceHeight()

width = Mobile.getDeviceWidth()

int a = width / 2

int b = height - 100

int c = a

int d = 0

Mobile.delay(10)

Mobile.swipe(a, b, c, d)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/btnSpesifikasiTambahProduk'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/btnSpesifikasiJenisPakaian'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/btnSpesifikasiBaju'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/btnSpesifikasiBahan'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/btnSpesifikasiStainlessSteel'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/btnSimpan'), 0)

Mobile.setText(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/txtBoxHargaProduk'), '990999', 0)

Mobile.tap(findTestObject('btnKeyboardDone'), 0)

Mobile.setText(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/txtBoxStok'), '99', 0)

Mobile.tap(findTestObject('btnKeyboardDone'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/btnPengirimanTambahProduk'), 0)

Mobile.setText(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/txtBoxBeratProduk'), '500', 0)

Mobile.tap(findTestObject('btnKeyboardDone'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/btnSimpan (1)'), 0)

Mobile.tap(findTestObject('0405_Seller/040505_Produk/04050501_TambahProduk/btnTambahkanProdukIni'), 0)

