/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package io.typefox.yang.scoping;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import io.typefox.yang.scoping.IScopeContext;
import io.typefox.yang.scoping.ScopeContextProvider;
import io.typefox.yang.yang.YangPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;

/**
 * Scope provider for YANG, which is based on single batch processing and subsequently caching scopes
 */
@SuppressWarnings("all")
public class YangScopeProvider implements IScopeProvider {
  @Inject
  private ScopeContextProvider provider;
  
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    final IScopeContext ctx = this.findScopeInAdapters(context, reference);
    EClass _eReferenceType = reference.getEReferenceType();
    boolean _matched = false;
    if (Objects.equal(_eReferenceType, YangPackage.Literals.MODULE)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_eReferenceType, YangPackage.Literals.ABSTRACT_MODULE)) {
        _matched=true;
      }
    }
    if (_matched) {
      return ctx.getModuleScope();
    }
    if (!_matched) {
      if (Objects.equal(_eReferenceType, YangPackage.Literals.GROUPING)) {
        _matched=true;
        return ctx.getGroupingScope();
      }
    }
    if (!_matched) {
      if (Objects.equal(_eReferenceType, YangPackage.Literals.TYPEDEF)) {
        _matched=true;
        return ctx.getTypeScope();
      }
    }
    if (!_matched) {
      if (Objects.equal(_eReferenceType, YangPackage.Literals.FEATURE)) {
        _matched=true;
        return ctx.getFeatureScope();
      }
    }
    if (!_matched) {
      if (Objects.equal(_eReferenceType, YangPackage.Literals.IDENTITY)) {
        _matched=true;
        return ctx.getIdentityScope();
      }
    }
    if (!_matched) {
      if (Objects.equal(_eReferenceType, YangPackage.Literals.EXTENSION)) {
        _matched=true;
        return ctx.getExtensionScope();
      }
    }
    return ctx.getSchemaNodeScope();
  }
  
  public IScopeContext findScopeInAdapters(final EObject object, final EReference reference) {
    return this.provider.findScopeContext(object);
  }
}
