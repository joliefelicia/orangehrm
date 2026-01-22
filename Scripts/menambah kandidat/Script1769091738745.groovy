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

WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('admin/input_Username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/admin/tambah vacancy/Page_OrangeHRM/input_Password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/admin/tambah vacancy/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/admin/tambah vacancy/Page_OrangeHRM/span_Recruitment'))

WebUI.click(findTestObject('Object Repository/admin/tambah vacancy/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/admin/tambah vacancy/Page_OrangeHRM/input_First Name'), 'Jolie')

WebUI.setText(findTestObject('Object Repository/admin/tambah vacancy/Page_OrangeHRM/input_Last Name'), 'Felicia')

WebUI.click(findTestObject('Object Repository/admin/tambah vacancy/Page_OrangeHRM/div_Select'))

WebUI.click(findTestObject('Object Repository/admin/tambah vacancy/Page_OrangeHRM/div_Junior Account Assistant'))

WebUI.setText(findTestObject('Object Repository/admin/tambah vacancy/Page_OrangeHRM/input_Type here'), 'feliciajolie31@gmail.com')

WebUI.setText(findTestObject('Object Repository/admin/tambah vacancy/Page_OrangeHRM/input_Type here_1'), '0867875564638785')

WebUI.uploadFile(findTestObject('Object Repository/admin/tambah vacancy/Page_OrangeHRM/input_oxd-file-input'), 'C:\\Users\\asus2\\Downloads\\foto diri\\CV-Bahasa-Indonesia-Jolie-Felicia..pdf')

WebUI.setText(findTestObject('Object Repository/admin/tambah vacancy/Page_OrangeHRM/input_Enter comma seperated words'), 
    'Quality Assurance')

WebUI.click(findTestObject('Object Repository/admin/tambah vacancy/Page_OrangeHRM/input_yyyy-dd-mm'))

WebUI.click(findTestObject('Object Repository/admin/tambah vacancy/Page_OrangeHRM/div_15'))

WebUI.check(findTestObject('Object Repository/admin/tambah vacancy/Page_OrangeHRM/i_oxd-icon bi-check oxd-checkbox-input-icon'))

WebUI.click(findTestObject('Object Repository/admin/tambah vacancy/Page_OrangeHRM/button_Save'))

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('admin/tambah vacancy/Page_OrangeHRM/button_Shortlist'))

WebUI.setText(findTestObject('admin/tambah vacancy/Page_OrangeHRM/textarea_Type here'), 'continue')

WebUI.click(findTestObject('admin/tambah vacancy/Page_OrangeHRM/button_Save'))

