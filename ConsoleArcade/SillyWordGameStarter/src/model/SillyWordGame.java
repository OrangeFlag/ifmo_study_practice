package model;

import java.util.Iterator;
import java.util.List;

public class SillyWordGame implements Iterable<Phrase> {

    private List<Phrase> phrases;

    public SillyWordGame(List<Phrase> phrases) {
        this.phrases = phrases;
    }

    //EFFECTS: returns all phrases in this game
    public List<Phrase> getAllPhrases() {
        return phrases;
    }

    @Override
    public Iterator<Phrase> iterator() {
        return new SillyWordGameIterator();
    }

    private class SillyWordGameIterator implements Iterator<Phrase>
    {
        Iterator phrasesIterator = phrases.iterator();
        Phrase last = null;

        @Override
        public boolean hasNext() {
            last = GoNextPhraseNeedsWord();
            return last != null;
        }

        @Override
        public Phrase next() {
            return last;
        }

        private Phrase GoNextPhraseNeedsWord() {
            for (Iterator it = phrasesIterator; it.hasNext(); ) {
                Phrase ph = (Phrase) it.next();
                if (ph.needsWord())
                    return ph;
            }
            return null;
        };
    };
}