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

WebUI.navigateToUrl('https://www.automationexercise.com/signup')

WebUI.setText(findTestObject('Object Repository/Page_LoginSignup/SignUp/input_New User Signup_name'), 'Tester03')

WebUI.setText(findTestObject('Object Repository/Page_LoginSignup/SignUp/input_New User Signup_email'), 'Tester1811-3@yopmail.com')

WebUI.click(findTestObject('Object Repository/Page_LoginSignup/SignUp/button_Signup'))

WebUI.click(findTestObject('Object Repository/Page_LoginSignup/SignUp/input_Mrs_id_gender2'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LoginSignup/SignUp/input__password'), 'jLKprVRkgCS3pDmpKAnNag==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_LoginSignup/SignUp/select_Day123456789101112131415161718192021_40ab5b'), 
    '17', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_LoginSignup/SignUp/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_LoginSignup/SignUp/select_Year20212020201920182017201620152014_f874ed'), 
    '2000', true)

WebUI.setText(findTestObject('Object Repository/Page_LoginSignup/SignUp/input__first_name'), 'Tester')

WebUI.setText(findTestObject('Object Repository/Page_LoginSignup/SignUp/input__last_name'), 'Test')

WebUI.click(findTestObject('Object Repository/Page_LoginSignup/SignUp/form_TitleMr.Mrs.Name Email Password Date o_43ff1f'))

WebUI.setText(findTestObject('Object Repository/Page_LoginSignup/SignUp/input_(Street address, P.O. Box, Company na_957d3e'), 
    'New Delhi')

WebUI.setText(findTestObject('Object Repository/Page_LoginSignup/SignUp/input__state'), 'Delhi')

WebUI.setText(findTestObject('Object Repository/Page_LoginSignup/SignUp/input__city'), 'New Delhi')

WebUI.setText(findTestObject('Object Repository/Page_LoginSignup/SignUp/input__zipcode'), '12345')

WebUI.setText(findTestObject('Object Repository/Page_LoginSignup/SignUp/input__mobile_number'), '8784513296')

WebUI.click(findTestObject('Object Repository/Page_LoginSignup/SignUp/button_Create Account'))

WebUI.getText(findTestObject('Page_LoginSignup/SignUp/b_Account Created'))

