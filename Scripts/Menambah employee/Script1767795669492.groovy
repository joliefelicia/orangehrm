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

WebUI.setText(findTestObject('Object Repository/admin/input_Username'), 'Admin')

WebUI.setText(findTestObject('Object Repository/admin/input_Password'), 'admin123')

WebUI.click(findTestObject('Object Repository/admin/button_Login'))

WebUI.click(findTestObject('Object Repository/admin/tambah karyawan/a_PIM'))

WebUI.click(findTestObject('Object Repository/admin/tambah karyawan/li_Add Employee'))

WebUI.setText(findTestObject('Object Repository/admin/tambah karyawan/input_First Name'), 'Jolie')

WebUI.setText(findTestObject('Object Repository/admin/tambah karyawan/input_Last Name'), 'Felicia')

WebUI.click(findTestObject('Object Repository/admin/tambah karyawan/button_none'))

WebUI.uploadFile(findTestObject('Object Repository/admin/tambah karyawan/input_oxd-file-input'), 'C:\\Users\\asus2\\Katalon Studio\\Orangehrm\\photo\\1742178398190.jpeg')

WebUI.click(findTestObject('Object Repository/admin/tambah karyawan/span_oxd-switch-input oxd-switch-input-active -l'))

WebUI.setText(findTestObject('Object Repository/admin/tambah karyawan/input_oxd-input oxd-input-active'), 'Jolie')

WebUI.setEncryptedText(findTestObject('Object Repository/admin/tambah karyawan/input_oxd-input oxd-input-active_1'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/admin/tambah karyawan/input_oxd-input oxd-input-active_2'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/admin/tambah karyawan/button_Save'))

