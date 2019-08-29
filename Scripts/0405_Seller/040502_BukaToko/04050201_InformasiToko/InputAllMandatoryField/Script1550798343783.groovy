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

Mobile.delay(10)

Mobile.setText(findTestObject('0405_Seller/040502_BukaToko/04050201_InformasiToko/txtBoxNamaPemilikToko (1)'), 'Dias', 0)

WebUI.callTestCase(findTestCase('HideKeyboardByTap'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('0405_Seller/040502_BukaToko/04050201_InformasiToko/txtBoxNamaToko (1)'), 'Dilans', 0)

WebUI.callTestCase(findTestCase('HideKeyboardByTap'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('0405_Seller/040502_BukaToko/04050201_InformasiToko/txtBoxDomainToko (1)'), 'Dilantais', 0)

WebUI.callTestCase(findTestCase('HideKeyboardByTap'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SwipeUp'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('0405_Seller/040502_BukaToko/04050201_InformasiToko/txtBoxDeskripsiToko (1)'), 'anjays', 0)

WebUI.callTestCase(findTestCase('HideKeyboardByTap'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('0405_Seller/040502_BukaToko/04050201_InformasiToko/txtBoxAlamatToko (1)'), 'aws', 0)

WebUI.callTestCase(findTestCase('HideKeyboardByTap'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('0405_Seller/040502_BukaToko/04050201_InformasiToko/pickerProvinsi'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SwipePickerUp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('HideKeyboardByTap'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('0405_Seller/040502_BukaToko/04050201_InformasiToko/pickerKota'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SwipePickerUp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('HideKeyboardByTap'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('0405_Seller/040502_BukaToko/04050201_InformasiToko/pickerKecamatan (1)'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SwipePickerUp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('HideKeyboardByTap'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('0405_Seller/040502_BukaToko/04050201_InformasiToko/txtBoxKodePos (1)'), '1231223', 0)

WebUI.callTestCase(findTestCase('HideKeyboardByTap'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('0405_Seller/040502_BukaToko/04050201_InformasiToko/btnLanjutkan'), 0, FailureHandling.STOP_ON_FAILURE)

