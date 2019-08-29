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

assert Mobile.verifyElementText(findTestObject('0405_Seller/040502_BukaToko/04050201_InformasiToko/labelLogoToko'), 'Logo Toko (Opsional)')

Mobile.verifyElementExist(findTestObject('0405_Seller/040502_BukaToko/04050201_InformasiToko/imgLogoShop'), 0)

assert Mobile.verifyElementText(findTestObject('0405_Seller/040502_BukaToko/04050201_InformasiToko/labelGuideLogoPhoto'), 'Ukuran gambar maksimal 5 Megabytes (5MB) dalam bentuk .JPG dan .JPEG')

Mobile.tap(findTestObject('0405_Seller/040502_BukaToko/04050201_InformasiToko/imgLogoShop'), 0)

Mobile.tap(findTestObject('0405_Seller/040502_BukaToko/04050201_InformasiToko/btnKamera'), 0)

Mobile.tap(findTestObject('0405_Seller/040502_BukaToko/04050201_InformasiToko/btnShotCamera'), 0)

Mobile.delay(10)

