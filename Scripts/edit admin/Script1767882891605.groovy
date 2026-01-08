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

WebUI.setText(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/admin/input_Username'), 'Admin')

WebUI.setText(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/admin/input_Password'), 'admin123')

WebUI.click(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/admin/button_Login'))

WebUI.click(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/admin/a_Admin'))

WebUI.click(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/Page_OrangeHRM/button_oxd-icon-button oxd-table-cell-action-spa'))

WebUI.sendKeys(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/Page_OrangeHRM/input_Type for hints'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/Page_OrangeHRM/input_Type for hints'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/Page_OrangeHRM/input_Type for hints'), 'tim')

WebUI.click(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/Page_OrangeHRM/span_Timothy Lewis Amiano'))

WebUI.click(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/Page_OrangeHRM/div_Enabled'))

WebUI.click(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/Page_OrangeHRM/div_ESS'))

WebUI.sendKeys(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/Page_OrangeHRM/input_oxd-input oxd-input-focus'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/Page_OrangeHRM/input_oxd-input oxd-input-focus'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/Page_OrangeHRM/input_oxd-input oxd-input-focus'), 
    'Joliefeliciaa')

WebUI.check(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/Page_OrangeHRM/label_Yes'))

WebUI.setText(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/Page_OrangeHRM/input_oxd-input oxd-input-focus_1'), 
    'admin123')

WebUI.setText(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/Page_OrangeHRM/input_oxd-input oxd-input-focus_2'), 
    'admin123')

WebUI.click(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/Page_OrangeHRM/button_Save'))

//WebUI.openBrowser('')
//
//WebUI.setText(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/Page_OrangeHRM/input_Type for hints'), 'tim')
//
//WebUI.click(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/Page_OrangeHRM/div_Admin'))
//
//WebUI.click(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/Page_OrangeHRM/span_Disabled'))
//
//WebUI.setText(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/Page_OrangeHRM/input_Type for hints'), 'a')
//
//WebUI.click(findTestObject('Object Repository/admin/edit admin/Page_OrangeHRM/Page_OrangeHRM/span_Ranga Akunuri'))

