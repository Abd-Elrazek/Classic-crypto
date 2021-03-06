package crypto.cryptanalysis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * These tests are very time consuming compared to other tests due to the
 * generation of permutations
 *
 * @author jpssilve
 */
public class AttackTranspositionCipherTest {

    private AttackTranspositionCipher attack;

    @Before
    public void setUp() {
        attack = new AttackTranspositionCipher();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void attackShortKeyWordsNaiveTest1() {
        String ciphertext = "TTRTROTOOEOAMWNZCOAZEAKRTER";
        assertEquals("eabcd", attack.attackShortKeyWordsPreGenerated(ciphertext));
    }

    @Test
    public void attackShortKeyWordsTest1() {
        String ciphertext = "TTRTROTOOEOAMWNZCOAZEAKRTER";
        assertEquals("eabcd", attack.attackShortKeyWordsDynamic(ciphertext));
    }

    @Test
    public void crackWithKeyTest1() {
        String ciphertext = "QDBSSAGNTDOLLCSERUELAESTOSIOODDUYSANUFRISUIUHARRGAE"
                + "MLULANORSARCROSMEPDVNUXVSTBCNAFNTIWUZUFIITEISDMOENSEYINUMDIAITACEEHECCC";
        String keycandidate = attack.attackShortKeyWordsDynamic(ciphertext);
        assertEquals("AFREQUENCYDISTRIBUTIONSHOWSUSASUMMARIZEDGROUPING"
                + "OFDATADIVIDEDINTOMUTUALLYEXCLUSIVECLASSESANDTHENUMBER"
                + "OFOCCURRENCESINACLASS", attack.crackWithKey(keycandidate, ciphertext));
    }

    @Test
    public void crackWithKeyTest2() {
        String ciphertext = "NSTLEICYEMPMHELGOAAHVCOTBYAAAESEAWAMNERTATHOPFTMZDHAISAALITSUOOAZNSREMSEAVTLETYGUAEGREERNIUAKRNRPSMS";
        String keycandidate = attack.attackShortKeyWordsDynamic(ciphertext);
        assertEquals("ANAGRAMSAREINTHEMSELVESARECREATIONALACTIVITYBUTTHEYALSOMAKEUPPARTOFMANYOTHERGAMESPUZZLESANDGAMESHOWS",
                attack.crackWithKey(keycandidate, ciphertext));
    }
}
