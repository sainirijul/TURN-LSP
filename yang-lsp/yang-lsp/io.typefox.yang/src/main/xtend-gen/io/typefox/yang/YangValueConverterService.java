package io.typefox.yang;

import com.google.inject.Inject;
import io.typefox.yang.utils.YangStringUtils;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class YangValueConverterService extends AbstractDeclarativeValueConverterService {
  public static class StringConverter implements IValueConverter<String>, IValueConverter.RuleSpecific {
    @Override
    public String toString(final String value) throws ValueConverterException {
      return YangStringUtils.addQuotesIfNecessary(value);
    }
    
    private static final char[] quotes = { '\"', '\'' };
    
    @Override
    public String toValue(final String string, final INode node) throws ValueConverterException {
      final StringBuilder result = new StringBuilder();
      Iterable<ILeafNode> _leafNodes = node.getLeafNodes();
      for (final ILeafNode n : _leafNodes) {
        boolean _isHidden = n.isHidden();
        boolean _not = (!_isHidden);
        if (_not) {
          final String seg = n.getText();
          int _length = seg.length();
          boolean _greaterEqualsThan = (_length >= 2);
          if (_greaterEqualsThan) {
            final char first = seg.charAt(0);
            if ((((List<Character>)Conversions.doWrapArray(YangValueConverterService.StringConverter.quotes)).contains(Character.valueOf(first)) && (seg.charAt((seg.length() - 1)) == first))) {
              int _length_1 = seg.length();
              int _minus = (_length_1 - 1);
              result.append(seg.substring(1, _minus));
            } else {
              result.append(seg);
            }
          } else {
            result.append(seg);
          }
        }
      }
      return result.toString();
    }
    
    @Accessors
    private AbstractRule rule;
    
    @Pure
    public AbstractRule getRule() {
      return this.rule;
    }
    
    public void setRule(final AbstractRule rule) {
      this.rule = rule;
    }
  }
  
  public static class NumberConverter implements IValueConverter<String>, IValueConverter.RuleSpecific {
    @Override
    public String toString(final String value) throws ValueConverterException {
      return value;
    }
    
    @Override
    public String toValue(final String string, final INode node) throws ValueConverterException {
      try {
        Double.parseDouble(string);
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          final NumberFormatException e = (NumberFormatException)_t;
          throw new ValueConverterException((("Couldn\'t convert \'" + string) + "\' to an double value."), node, e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      return string;
    }
    
    @Accessors
    private AbstractRule rule;
    
    @Pure
    public AbstractRule getRule() {
      return this.rule;
    }
    
    public void setRule(final AbstractRule rule) {
      this.rule = rule;
    }
  }
  
  public static class SimpleStringConverter implements IValueConverter<String>, IValueConverter.RuleSpecific {
    @Override
    public String toString(final String value) throws ValueConverterException {
      return value;
    }
    
    @Override
    public String toValue(final String string, final INode node) throws ValueConverterException {
      return string;
    }
    
    @Accessors
    private AbstractRule rule;
    
    @Pure
    public AbstractRule getRule() {
      return this.rule;
    }
    
    public void setRule(final AbstractRule rule) {
      this.rule = rule;
    }
  }
  
  @Inject
  private YangValueConverterService.StringConverter stringValueConverter;
  
  @ValueConverter(rule = "io.typefox.yang.Yang.StringValue")
  public IValueConverter<String> StringValue() {
    return this.stringValueConverter;
  }
  
  @ValueConverter(rule = "StringValue")
  public IValueConverter<String> StringValue2() {
    return this.stringValueConverter;
  }
  
  @Inject
  private YangValueConverterService.NumberConverter numberValueConverter;
  
  @ValueConverter(rule = "io.typefox.yang.Yang.NUMBER")
  public IValueConverter<String> NUMBERValue() {
    return this.numberValueConverter;
  }
  
  @ValueConverter(rule = "NUMBER")
  public IValueConverter<String> NUMBERValue2() {
    return this.numberValueConverter;
  }
  
  @Inject
  private YangValueConverterService.SimpleStringConverter simpleStringConverter;
  
  @ValueConverter(rule = "io.typefox.yang.Yang.STRING")
  public IValueConverter<String> STRINGValue() {
    return this.simpleStringConverter;
  }
  
  @ValueConverter(rule = "STRING")
  public IValueConverter<String> STRINGValue2() {
    return this.simpleStringConverter;
  }
}
