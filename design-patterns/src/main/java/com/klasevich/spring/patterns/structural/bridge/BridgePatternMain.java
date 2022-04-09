package com.klasevich.spring.patterns.structural.bridge;

import com.klasevich.spring.patterns.structural.bridge.impl.CurrentAccount;
import com.klasevich.spring.patterns.structural.bridge.impl.HdfcBank;
import com.klasevich.spring.patterns.structural.bridge.impl.IciciBank;
import com.klasevich.spring.patterns.structural.bridge.impl.SavingAccount;

public class BridgePatternMain {
    public static void main(String[] args) {
        Bank icici = new IciciBank(new CurrentAccount());
        Account current = icici.openAccount();
        current.accountType();
        Bank hdfc = new HdfcBank(new SavingAccount());
        Account saving = hdfc.openAccount();
        saving.accountType();
    }
}
