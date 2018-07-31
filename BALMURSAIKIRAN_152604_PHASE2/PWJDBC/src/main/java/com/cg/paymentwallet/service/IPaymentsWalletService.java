package com.cg.paymentwallet.service;

import java.math.BigDecimal;

import com.cg.paymentwallet.dto.Customer;
import com.cg.paymentwallet.dto.Wallet;
import com.cg.paymentwallet.exception.PaymentWalletException;



public interface IPaymentsWalletService {
	
	Customer registerCustomer(Customer customer)throws PaymentWalletException;
	Customer depositMoney(String phone,BigDecimal balance) throws PaymentWalletException;
	Customer withdrawMoney(String phone,BigDecimal balance) throws PaymentWalletException;
	Customer fundTransfer(String sourcePhone,String targetPhone,BigDecimal balance) throws PaymentWalletException;
	Customer showBalance(String phone) throws PaymentWalletException;
	String printTransaction(String phone) throws PaymentWalletException;
	boolean validatePhone(String phoneNumber) throws PaymentWalletException;
	boolean validateMoney(BigDecimal balance) throws PaymentWalletException;
	boolean validateAge(Integer age) throws PaymentWalletException;
	boolean validateGender(String gender) throws PaymentWalletException;
	boolean validateName(String name) throws PaymentWalletException;
	boolean validateEmail(String emailId) throws PaymentWalletException;
	boolean validatePassword(String pass)throws PaymentWalletException;
	boolean checkLogin(String number, String password);
}
