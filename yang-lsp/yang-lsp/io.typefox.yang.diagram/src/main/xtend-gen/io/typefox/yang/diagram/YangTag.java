package io.typefox.yang.diagram;

import io.typefox.sprotty.api.Layouting;
import io.typefox.sprotty.api.SShapeElement;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class YangTag extends SShapeElement implements Layouting {
  private String layout;
  
  public YangTag() {
  }
  
  public YangTag(final Procedure1<? super YangTag> initializer) {
    initializer.apply(this);
  }
  
  @Pure
  public String getLayout() {
    return this.layout;
  }
  
  public void setLayout(final String layout) {
    this.layout = layout;
  }
}
