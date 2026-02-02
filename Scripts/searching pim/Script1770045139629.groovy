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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('admin/input_Username'), 'admin')

WebUI.setText(findTestObject('admin/input_Password'), 'admin123')

WebUI.click(findTestObject('admin/button_Login'))

WebUI.click(findTestObject('Object Repository/admin/searching pim/Page_OrangeHRM/a_PIM'))

WebUI.setText(findTestObject('Object Repository/admin/searching pim/Page_OrangeHRM/input_Type for hints'), 'Rebecca')

WebUI.click(findTestObject('Object Repository/admin/searching pim/Page_OrangeHRM/div_Rebecca Harmony'))

WebUI.click(findTestObject('Object Repository/admin/searching pim/Page_OrangeHRM/div_Select'))

WebUI.click(findTestObject('Object Repository/admin/searching pim/Page_OrangeHRM/div_Full-Time Contract'))

WebUI.click(findTestObject('Object Repository/admin/searching pim/Page_OrangeHRM/button_Search'))

//WebUI.click(findTestObject('Object Repository/admin/searching pim/Page_OrangeHRM/div_Select'))
//
//WebUI.click(findTestObject('Object Repository/admin/searching pim/Page_OrangeHRM/div_Full-Time Contract'))
//
//WebUI.click(findTestObject('Object Repository/admin/searching pim/Page_OrangeHRM/button_Search'))
//
//WebUI.click(findTestObject('Object Repository/admin/searching pim/Page_OrangeHRM/div_Rebecca Harmony_1'))

