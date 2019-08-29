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

'2.1 Blanja Logo should be displayed'
Mobile.verifyElementExist(findTestObject('0405_Seller/040501_LoginPage/imgBlanjaLogoLoginPage'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'2.2 Username text fied will be displayed with hint text "Username / Email / No. Telepon"'
Mobile.verifyElementExist(findTestObject('0405_Seller/040501_LoginPage/txtBoxUsernameLoginPage'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'2.3 Password textfield will be displayed with hint text "Password"'
Mobile.verifyElementExist(findTestObject('0405_Seller/040501_LoginPage/txtBoxPasswordLoginPage'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'2.4 Masuk button will be displayed'
Mobile.verifyElementExist(findTestObject('0405_Seller/040501_LoginPage/btnMasukLoginPage'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'2.7 Lupa Password? button will be displayed'
Mobile.verifyElementExist(findTestObject('0405_Seller/040501_LoginPage/hrefLupaPasswordLogiinPage'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'2.8 "Belum Punya akun Blanja ? Daftar disini" will be displayed'
Mobile.verifyElementExist(findTestObject('0405_Seller/040501_LoginPage/labelBelumPunyaAkunBelanjaLoginPage'), 5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('0405_Seller/040501_LoginPage/hrefDaftarDisiniLoginPage'), 5, FailureHandling.CONTINUE_ON_FAILURE)

