package _08_pig_latin;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PigLatinTranslator implements ActionListener {
   // making the ui for the game
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton eToPig = new JButton();
	JButton pigToE = new JButton();
	JTextField english = new JTextField();
	JTextField pigLatin = new JTextField();
	JLabel equals = new JLabel();

	public void run() {
		frame.add(panel);
		panel.add(english);
		panel.add(eToPig);
		panel.add(pigToE);
		panel.add(pigLatin);
		panel.add(equals);

		panel.setLayout(null);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(500, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		english.setBounds(12, 25, 150, 50);
		english.setFont(new Font("Times New Roman", Font.BOLD, 15));
		eToPig.setBounds(170, 37, 55, 25);
		eToPig.setText("is>>");
		eToPig.addActionListener(this);
		pigLatin.setBounds(337, 25, 150, 50);
		pigLatin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		pigToE.setBounds(275, 37, 55, 25);
		pigToE.setText("<<is");
		pigToE.addActionListener(this);
		equals.setBounds(243, 37, 25, 25);
		equals.setFont(new Font("Times New Roman", Font.BOLD, 25));
		equals.setText("=");
	}
	/**
     * Method to translate a english to pig latin.
     * 
     * @param s
     *            The sentence in English
     * @return The pig latin version
     */
    public static String translateEnglishToPigLatin(String s) {
        String latin = "";
        int i = 0;
        while (i < s.length()) {
            // Take care of punctuation and spaces
            while (i < s.length() && !isLetter(s.charAt(i))) {
                latin = latin + s.charAt(i);
                i++;
            }
            // If there aren't any words left, stop.
            if (i >= s.length())
                break;
            // Otherwise we're at the beginning of a word.
            int begin = i;
            while (i < s.length() && isLetter(s.charAt(i))) {
                i++;
            }
            // Now we're at the end of a word, so translate it.
            int end = i;
            latin = latin + pigWord(s.substring(begin, end));
        }
        return latin;
    }
    
    /**
     * Method to translate a pig latin to english.
     * 
     * @param s
     *            The sentence in pig latin
     * @return The english version
     */
    public static String translatePigLatinToEnglish(String s) {
        String english = "";
        
        String[] words = s.split(" ");
        
        for( String word : words ) {
            String[] hyphenSplit = word.split("-");
            String translatedWord = word;
            String punctuation = "";
            
            if( hyphenSplit.length == 2 ) {
                if( hyphenSplit[1].startsWith("ay")) {
                    // Started with a vowel
                    
                    translatedWord = hyphenSplit[0];
                } else {
                    // Started with a consonant
                    
                    translatedWord = hyphenSplit[1].substring(0, firstVowel(hyphenSplit[1])) + hyphenSplit[0];
                }
                
                // Handle punctuation at the end of a word
                int lastLetterIndex = hyphenSplit[1].length() - 1;
                
                while( !Character.isLetter(hyphenSplit[1].charAt(lastLetterIndex)) ){
                    lastLetterIndex -= 1;
                }
                
                punctuation = hyphenSplit[1].substring(lastLetterIndex + 1);
            }
            
            // Add word
            if( english.isEmpty() ) {
                english += translatedWord + punctuation;
            } else {
                english = english + " " + translatedWord + punctuation;
            }
        }
        
        return english;
    }
    
    
    /**
     * Method to test whether a character is a letter or not.
     * 
     * @param c
     *            The character to test
     * @return True if it's a letter
     */
    private static boolean isLetter(char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
    }

    /**
     * Method to translate one word into pig latin.
     * 
     * @param word
     *            The word in english
     * @return The pig latin version
     */
    private static String pigWord(String word) {
        int split = firstVowel(word);
        return word.substring(split) + "-" + word.substring(0, split) + "ay";
    }

    /**
     * Method to find the index of the first vowel in a word.
     * 
     * @param word
     *            The word to search
     * @return The index of the first vowel
     */
    private static int firstVowel(String word) {
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++)
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
                    || word.charAt(i) == 'u')
                return i;
        return 0;
    }
	public static void main(String[] args) {
		PigLatinTranslator t = new PigLatinTranslator();
		t.run();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
if(e.getSource() == eToPig) {
	pigLatin.setText(translateEnglishToPigLatin(english.getText()));
}
if(e.getSource() == pigToE) {
	english.setText(translatePigLatinToEnglish(pigLatin.getText()));
}
		
	}
}