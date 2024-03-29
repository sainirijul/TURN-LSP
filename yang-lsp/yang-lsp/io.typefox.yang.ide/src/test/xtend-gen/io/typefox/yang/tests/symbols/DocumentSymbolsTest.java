package io.typefox.yang.tests.symbols;

import io.typefox.yang.tests.AbstractYangLSPTest;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.DocumentSymbolConfiguraiton;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Test;

@SuppressWarnings("all")
public class DocumentSymbolsTest extends AbstractYangLSPTest {
  @Test
  public void testEmpty() {
    final Procedure1<DocumentSymbolConfiguraiton> _function = (DocumentSymbolConfiguraiton it) -> {
      StringConcatenation _builder = new StringConcatenation();
      it.setModel(_builder.toString());
    };
    this.testDocumentSymbol(_function);
  }
  
  @Test
  public void testInputOutput() {
    final Procedure1<DocumentSymbolConfiguraiton> _function = (DocumentSymbolConfiguraiton it) -> {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module foo {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("rpc myAction {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("input {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("leaf x { type string; }");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("output {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("leaf x { type string; }");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      it.setModel(_builder.toString());
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("symbol \"myAction\" {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("kind: 6");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("location: MyModel.yang [[1, 5] .. [1, 13]]");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("symbol \"input\" {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("kind: 7");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("location: MyModel.yang [[2, 2] .. [2, 7]]");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("container: \"myAction\"");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("symbol \"x\" {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("kind: 13");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("location: MyModel.yang [[3, 8] .. [3, 9]]");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("container: \"input\"");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("symbol \"output\" {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("kind: 9");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("location: MyModel.yang [[5, 2] .. [5, 8]]");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("container: \"myAction\"");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("symbol \"x\" {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("kind: 13");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("location: MyModel.yang [[6, 8] .. [6, 9]]");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("container: \"output\"");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      it.setExpectedSymbols(_builder_1.toString());
    };
    this.testDocumentSymbol(_function);
  }
  
  @Test
  public void testDocumentSymbols() {
    final Procedure1<DocumentSymbolConfiguraiton> _function = (DocumentSymbolConfiguraiton it) -> {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module foo {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("grouping x {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("container bla {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("leaf test { type string; }");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("container bla2 {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("leaf test2 { type string; }");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("identity myIdentity;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("typedef myType {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("type string;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("feature someFeature;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      it.setModel(_builder.toString());
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("symbol \"x\" {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("kind: 5");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("location: MyModel.yang [[1, 10] .. [1, 11]]");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("symbol \"bla\" {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("kind: 3");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("location: MyModel.yang [[5, 11] .. [5, 14]]");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("symbol \"test\" {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("kind: 13");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("location: MyModel.yang [[6, 7] .. [6, 11]]");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("container: \"bla\"");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("symbol \"bla2\" {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("kind: 3");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("location: MyModel.yang [[7, 12] .. [7, 16]]");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("container: \"bla\"");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("symbol \"test2\" {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("kind: 13");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("location: MyModel.yang [[8, 8] .. [8, 13]]");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("container: \"bla2\"");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("symbol \"myIdentity\" {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("kind: 14");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("location: MyModel.yang [[12, 10] .. [12, 20]]");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("symbol \"myType\" {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("kind: 10");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("location: MyModel.yang [[13, 9] .. [13, 15]]");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("symbol \"someFeature\" {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("kind: 17");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("location: MyModel.yang [[16, 9] .. [16, 20]]");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      it.setExpectedSymbols(_builder_1.toString());
    };
    this.testDocumentSymbol(_function);
  }
}
