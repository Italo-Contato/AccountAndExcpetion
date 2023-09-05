package model.entities;

import model.exceptions.AccountException;

public class Account {
	private int number;
	private String holder;
	private Double balance;
	private Double whithdrawLimit;
	
	

	public Account(int number, String holder, Double balance, Double whithdrawLimit) {
		
		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.whithdrawLimit = whithdrawLimit;
	}
	
	public void whitDraw(Double whitDraw) throws AccountException {
		if(balance == 0 || balance < 0) {
			throw new AccountException(" saldo é menor ou igual a zero");
		}
		if(whitDraw > whithdrawLimit) {
			throw new AccountException(" saque maior que o limite de saque");
		}
		if(whitDraw > balance) {
			throw new AccountException(" Não a saldo suficiente");
		}
		this.balance -= whitDraw;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWhithdrawLimit() {
		return whithdrawLimit;
	}

	public void setWhithdrawLimit(Double whithdrawLimit) {
		this.whithdrawLimit = whithdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return String.format("%.2f", balance);
				}
}
