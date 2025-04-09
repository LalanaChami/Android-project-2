package lalana_nasif.examples.localtesting

import org.junit.Assert
import org.junit.Test


class EmailValidatorTest {

    @Test
    fun validEmail_basicFormat_returnsTrue() {
        Assert.assertTrue(EmailValidator.isValidEmail("123@abc.com"))
    }

    @Test
    fun validEmail_subdomainFormat_returnsTrue() {
        Assert.assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"))
    }

    @Test
    fun invalidEmail_missingDomain_returnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("123@abc"))
    }

    @Test
    fun invalidEmail_doubleDots_returnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("123@abc..com"))
    }
}