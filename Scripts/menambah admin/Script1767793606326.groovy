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

WebUI.setText(findTestObject('admin/input_Username'), username)

WebUI.setText(findTestObject('admin/input_Password'), password)

WebUI.click(findTestObject('admin/button_Login'))

WebUI.click(findTestObject('admin/a_Admin'))

WebUI.click(findTestObject('Object Repository/admin/button_Add'))

WebUI.click(findTestObject('Object Repository/admin/div_Select'))

WebUI.click(findTestObject('Object Repository/admin/div_Admin'))

WebUI.click(findTestObject('Object Repository/admin/div_Select_1'))

WebUI.click(findTestObject('Object Repository/admin/div_Admin'))

WebUI.click(findTestObject('Object Repository/admin/div_Add UserUser RoleAdminEmployee NameNo Record'))

WebUI.setText(findTestObject('Object Repository/admin/input_oxd-input oxd-input-active'), 'joliefelicia')

WebUI.setText(findTestObject('Object Repository/admin/input_Type for hints'), 'a')

WebUI.click(findTestObject('admin/div_Timothy Lewis Amiano'))

WebUI.click(findTestObject('Object Repository/admin/input_oxd-input oxd-input-active_1'))

WebUI.setEncryptedText(findTestObject('Object Repository/admin/input_oxd-input oxd-input-active_1'), '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.click(findTestObject('Object Repository/admin/input_oxd-input oxd-input-active_2'))

WebUI.setEncryptedText(findTestObject('Object Repository/admin/input_oxd-input oxd-input-active_2'), '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.click(findTestObject('Object Repository/admin/button_Save'))

