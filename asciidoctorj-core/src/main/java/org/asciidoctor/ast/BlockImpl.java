package org.asciidoctor.ast;

import java.util.List;

import org.jruby.Ruby;

public class BlockImpl extends AbstractBlockImpl implements Block {
    private Block blockDelegate;

    public BlockImpl(Block blockDelegate, Ruby runtime) {
        super(blockDelegate, runtime);
        this.blockDelegate = blockDelegate;
    }

    @Override
    public List<String> lines() {
        return blockDelegate.lines();
    }
    
    @Override
    public String source() {
        return blockDelegate.source();
    }
}
