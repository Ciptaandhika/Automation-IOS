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

'2.1 Username/Email/No. Telepon field displayed'
Mobile.verifyElementExist(findTestObject('0405_Seller/040501_LoginPage/txtBoxUsernameLoginPage'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'2.2 Password field displayed'
Mobile.verifyElementExist(findTestObject('0405_Seller/040501_LoginPage/txtBoxPasswordLoginPage'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'2.3 User can enter this field'
Mobile.setText(findTestObject('0405_Seller/040501_LoginPage/txtBoxUsernameLoginPage'), GlobalVariable.usernameSellerLoginPage, 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.clearText(findTestObject('0405_Seller/040501_LoginPage/txtBoxUsernameLoginPage'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('0405_Seller/040501_LoginPage/txtBoxPasswordLoginPage'), GlobalVariable.passwordSellerLoginPage, 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.clearText(findTestObject('0405_Seller/040501_LoginPage/txtBoxPasswordLoginPage'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'2.4 This field is mandatory'
Mobile.tap(findTestObject('0405_Seller/040501_LoginPage/btnMasukLoginPage'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('0405_Seller/040501_LoginPage/labelErrorPasswordLoginPage'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('0405_Seller/040501_LoginPage/labelErrorUsernameLoginPage'), 0, FailureHandling.CONTINUE_ON_FAILURE)

