import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Mobile.startApplication('/Users/rakun/Downloads/kalkulator.apk', true)

Mobile.tap(findTestObject('kalkulator/btn_6'), 0)

Mobile.tap(findTestObject('kalkulator/btn_6'), 0)

Mobile.tap(findTestObject('kalkulator/btn_kurang'), 0)

Mobile.tap(findTestObject('kalkulator/btn_1'), 0)

Mobile.verifyElementVisible(findTestObject('kalkulator/txt_hasil'), 0)

def hasil = Mobile.getText(findTestObject('kalkulator/txt_hasil'), 0)

if (hasil == '65') {
    print('hasil sesuai')
}

Mobile.tapAndHold(findTestObject('kalkulator/btn_hapus'), 0, 0)

