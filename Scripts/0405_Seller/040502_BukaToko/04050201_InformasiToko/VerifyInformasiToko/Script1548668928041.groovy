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

Mobile.verifyElementExist(findTestObject('0405_Seller/040501_LoginPage/btnBack'), 0)

header = Mobile.getText(findTestObject('0405_Seller/040502_BukaToko/04050201_InformasiToko/labelDaftarSebagaiSellerIndividual'), 
    0)

assert header == GlobalVariable.HeaderDaftarSebagaiSellerIndividualInformasiToko

Mobile.verifyElementExist(findTestObject('0405_Seller/040502_BukaToko/04050201_InformasiToko/labelStepInformasiToko'), 0)

informasiToko = Mobile.getText(findTestObject('0405_Seller/040502_BukaToko/04050201_InformasiToko/labelInformasiToko'), 
    0)

assert informasiToko == GlobalVariable.TitleInformasiToko

keteranganInformasiToko = Mobile.getText(findTestObject('0405_Seller/040502_BukaToko/04050201_InformasiToko/labelKeteranganInformasiToko'), 
    0)

assert keteranganInformasiToko == GlobalVariable.KeteranganInformasiToko

