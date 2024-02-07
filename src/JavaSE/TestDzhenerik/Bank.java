package JavaSE.TestDzhenerik;

import java.util.ArrayList;
import java.util.List;

public class Bank<T extends BankAccount> {
    private List<T> accounts = new ArrayList<>();

    public Bank() {
    }

    public Bank(List<T> accounts) {
        this.accounts = accounts;
    }

    public List<T> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<T> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(T account) {
        accounts.add(account);
    }

    public void removeAccount(String accountNumber) {
        for (T account: accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                accounts.remove(account);
                break;
            }
        }
    }

    public T getAccount(String accountNumber) {
        for (T account: accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

}
