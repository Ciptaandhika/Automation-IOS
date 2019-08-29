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

Mobile.tap(findTestObject('0401_Mainsite/040101_Homepage/btnIconCart'), 0)

Mobile.tap(findTestObject('0404_Trade/030401_Cart/btnPembayaran'), 0)

Mobile.delay(20)

Mobile.tap(findTestObject('0404_Trade/030402_OrderConfrim/btnPilihMetodePembayaran'), 0)

Mobile.tap(findTestObject('0404_Trade/030403_MethodPayment/btnSwitchDompetBlanja'), 0)

Mobile.tap(findTestObject('0404_Trade/030403_MethodPayment/labelSettingPasswordDompetBlanja'), 0)

