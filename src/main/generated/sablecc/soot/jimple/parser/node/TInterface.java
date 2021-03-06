/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class TInterface extends Token
{
    public TInterface()
    {
        super.setText("interface");
    }

    public TInterface(int line, int pos)
    {
        super.setText("interface");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TInterface(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInterface(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TInterface text.");
    }
}
