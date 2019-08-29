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

Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('0405_Seller/040502_BukaToko/04050202_KonfirmasiData/labelTipePenjual'), 0)

Mobile.verifyElementExist(findTestObject('0405_Seller/040502_BukaToko/04050202_KonfirmasiData/labelNamaPemilikToko'), 0)

Mobile.verifyElementExist(findTestObject('0405_Seller/040502_BukaToko/04050202_KonfirmasiData/labelNomorTelepon'), 0)

Mobile.verifyElementExist(findTestObject('0405_Seller/040502_BukaToko/04050202_KonfirmasiData/labelDomainToko'), 0)

WebUI.callTestCase(findTestCase('SwipeUp'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('0405_Seller/040502_BukaToko/04050202_KonfirmasiData/labelDeskripsiToko'), 0)

Mobile.verifyElementExist(findTestObject('0405_Seller/040502_BukaToko/04050202_KonfirmasiData/labelAlamatToko'), 0)

Mobile.verifyElementExist(findTestObject('0405_Seller/040502_BukaToko/04050202_KonfirmasiData/labelProvinsi'), 0)

Mobile.verifyElementExist(findTestObject('0405_Seller/040502_BukaToko/04050202_KonfirmasiData/labelKota'), 0)

Mobile.verifyElementExist(findTestObject('0405_Seller/040502_BukaToko/04050202_KonfirmasiData/labelKecamatan'), 0)

Mobile.verifyElementExist(findTestObject('0405_Seller/040502_BukaToko/04050202_KonfirmasiData/labelKodepos'), 0)

Mobile.verifyElementExist(findTestObject('0405_Seller/040502_BukaToko/04050202_KonfirmasiData/labelTermOfCondition'), 0)

