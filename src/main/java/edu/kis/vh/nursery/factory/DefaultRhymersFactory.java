package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 * Default class implementing Rhymers Factory interface
 * @Override 4 methods
 */
public class DefaultRhymersFactory implements RhymersFactory {

    /**
     * Method creating Standard Rhymer
     * @return New Standard Rhymer
     */
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * Method creating False Rhymer
     * @return New False Rhymer
     */
    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * Method creating FIFO Rhymer
     * @return New FIFO Rhymer
     */
    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    /**
     * Method creating Hanoi Rhymer
     * @return New Hanoi Rhymer
     */
    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }
}