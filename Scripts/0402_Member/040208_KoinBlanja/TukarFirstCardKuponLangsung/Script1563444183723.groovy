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

int width = Mobile.getDeviceWidth()

int height = Mobile.getDeviceHeight()

int a = width / 2

int b = height - 100

int c = a

int d = b - 250

int e = height + 500

Mobile.swipe(a, b, c, d)

Mobile.tap(findTestObject('0402_Member/040208_KoinBlanja/btnTukarHadiahLangsungFirstCard'), 0)

Mobile.verifyElementExist(findTestObject('0402_Member/040208_KoinBlanja/scrollViewDetailHadiah'), 0)

Mobile.tap(findTestObject('0402_Member/040208_KoinBlanja/btnYaTukarKoin'), 0)

WebUI.delay(10)

Mobile.swipe(a, b, c, e)

