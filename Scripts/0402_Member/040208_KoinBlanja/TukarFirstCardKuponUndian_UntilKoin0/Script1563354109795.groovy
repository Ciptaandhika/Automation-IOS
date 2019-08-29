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

println(height)

int a = width / 2

int b = height - 100

int c = a

int d = height + 500

println(b)

int koinCost = Integer.parseInt(Mobile.getText(findTestObject('Object Repository/0402_Member/040208_KoinBlanja/labelKoinCostFirstCardKuponUndian'), 
        0).replaceAll('[^\\d]', ''))

println(koinCost)

int koin = Integer.parseInt(GlobalVariable.KoinBlanjaEmpty)

println(koin)

int qty = ((koin) as int) / koinCost

println(qty)

if (qty > 1) {
    for (int x = 1; x < qty; x++) {
        Mobile.tap(findTestObject('Object Repository/0402_Member/040208_KoinBlanja/btnTambah'), 0)
    }
}

Mobile.tap(findTestObject('0402_Member/040208_KoinBlanja/btnTukarFirstCardUndian'), 0)

Mobile.tap(findTestObject('0402_Member/040208_KoinBlanja/btnYaTukarKoin'), 0)

WebUI.delay(10)

Mobile.swipe(a, b, c, d)

