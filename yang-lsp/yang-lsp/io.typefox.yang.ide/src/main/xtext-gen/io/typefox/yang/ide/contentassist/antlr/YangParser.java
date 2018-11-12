/*
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package io.typefox.yang.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import io.typefox.yang.ide.contentassist.antlr.internal.InternalYangParser;
import io.typefox.yang.services.YangGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class YangParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(YangGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, YangGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractModuleAccess().getAlternatives(), "rule__AbstractModule__Alternatives");
			builder.put(grammarAccess.getStatementEndAccess().getAlternatives(), "rule__StatementEnd__Alternatives");
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getAbstractImportAccess().getAlternatives(), "rule__AbstractImport__Alternatives");
			builder.put(grammarAccess.getSchemaNodeAccess().getAlternatives(), "rule__SchemaNode__Alternatives");
			builder.put(grammarAccess.getDataSchemaNodeAccess().getAlternatives(), "rule__DataSchemaNode__Alternatives");
			builder.put(grammarAccess.getOtherStatementAccess().getAlternatives(), "rule__OtherStatement__Alternatives");
			builder.put(grammarAccess.getEnumerableAccess().getAlternatives(), "rule__Enumerable__Alternatives");
			builder.put(grammarAccess.getOrderedAccess().getAlternatives(), "rule__Ordered__Alternatives");
			builder.put(grammarAccess.getRefinableAccess().getAlternatives(), "rule__Refinable__Alternatives");
			builder.put(grammarAccess.getTypeReferenceAccess().getAlternatives(), "rule__TypeReference__Alternatives");
			builder.put(grammarAccess.getIfFeatureExpressionAccess().getAlternatives(), "rule__IfFeatureExpression__Alternatives");
			builder.put(grammarAccess.getExplicitRefinementExpressionAccess().getAlternatives(), "rule__ExplicitRefinementExpression__Alternatives");
			builder.put(grammarAccess.getXpathExpressionAccess().getAlternatives(), "rule__XpathExpression__Alternatives");
			builder.put(grammarAccess.getXpathEqualityExprAccess().getOperatorAlternatives_1_1_0(), "rule__XpathEqualityExpr__OperatorAlternatives_1_1_0");
			builder.put(grammarAccess.getXpathRelationalExprAccess().getOperatorAlternatives_1_1_0(), "rule__XpathRelationalExpr__OperatorAlternatives_1_1_0");
			builder.put(grammarAccess.getXpathAdditiveExprAccess().getOperatorAlternatives_1_1_0(), "rule__XpathAdditiveExpr__OperatorAlternatives_1_1_0");
			builder.put(grammarAccess.getXpathMultiplicativeExprAccess().getOperatorAlternatives_1_1_0(), "rule__XpathMultiplicativeExpr__OperatorAlternatives_1_1_0");
			builder.put(grammarAccess.getXpathUnaryExprAccess().getAlternatives(), "rule__XpathUnaryExpr__Alternatives");
			builder.put(grammarAccess.getXpathPrimaryExprAccess().getAlternatives(), "rule__XpathPrimaryExpr__Alternatives");
			builder.put(grammarAccess.getXpathStepAccess().getAlternatives(), "rule__XpathStep__Alternatives");
			builder.put(grammarAccess.getXpathNodeTestAccess().getAlternatives(), "rule__XpathNodeTest__Alternatives");
			builder.put(grammarAccess.getXpathNodeTypeAccess().getAlternatives(), "rule__XpathNodeType__Alternatives");
			builder.put(grammarAccess.getXpathAxisNameAccess().getAlternatives(), "rule__XpathAxisName__Alternatives");
			builder.put(grammarAccess.getXpathIDOrKwAccess().getAlternatives(), "rule__XpathIDOrKw__Alternatives");
			builder.put(grammarAccess.getIdOrKwAccess().getAlternatives(), "rule__IdOrKw__Alternatives");
			builder.put(grammarAccess.getQualifiedTypeNameAccess().getAlternatives_0_0(), "rule__QualifiedTypeName__Alternatives_0_0");
			builder.put(grammarAccess.getQualifiedTypeNameAccess().getAlternatives_1(), "rule__QualifiedTypeName__Alternatives_1");
			builder.put(grammarAccess.getBUILTIN_TYPEAccess().getAlternatives(), "rule__BUILTIN_TYPE__Alternatives");
			builder.put(grammarAccess.getKEYWORDAccess().getAlternatives(), "rule__KEYWORD__Alternatives");
			builder.put(grammarAccess.getSTATEMENT_KEYWORDAccess().getAlternatives(), "rule__STATEMENT_KEYWORD__Alternatives");
			builder.put(grammarAccess.getStatementEndAccess().getGroup_0(), "rule__StatementEnd__Group_0__0");
			builder.put(grammarAccess.getModuleAccess().getGroup(), "rule__Module__Group__0");
			builder.put(grammarAccess.getYangVersionAccess().getGroup(), "rule__YangVersion__Group__0");
			builder.put(grammarAccess.getNamespaceAccess().getGroup(), "rule__Namespace__Group__0");
			builder.put(grammarAccess.getPrefixAccess().getGroup(), "rule__Prefix__Group__0");
			builder.put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
			builder.put(grammarAccess.getRevisionDateAccess().getGroup(), "rule__RevisionDate__Group__0");
			builder.put(grammarAccess.getIncludeAccess().getGroup(), "rule__Include__Group__0");
			builder.put(grammarAccess.getOrganizationAccess().getGroup(), "rule__Organization__Group__0");
			builder.put(grammarAccess.getContactAccess().getGroup(), "rule__Contact__Group__0");
			builder.put(grammarAccess.getRevisionAccess().getGroup(), "rule__Revision__Group__0");
			builder.put(grammarAccess.getSubmoduleAccess().getGroup(), "rule__Submodule__Group__0");
			builder.put(grammarAccess.getBelongsToAccess().getGroup(), "rule__BelongsTo__Group__0");
			builder.put(grammarAccess.getTypedefAccess().getGroup(), "rule__Typedef__Group__0");
			builder.put(grammarAccess.getUnitsAccess().getGroup(), "rule__Units__Group__0");
			builder.put(grammarAccess.getDefaultAccess().getGroup(), "rule__Default__Group__0");
			builder.put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
			builder.put(grammarAccess.getContainerAccess().getGroup(), "rule__Container__Group__0");
			builder.put(grammarAccess.getMustAccess().getGroup(), "rule__Must__Group__0");
			builder.put(grammarAccess.getErrorMessageAccess().getGroup(), "rule__ErrorMessage__Group__0");
			builder.put(grammarAccess.getErrorAppTagAccess().getGroup(), "rule__ErrorAppTag__Group__0");
			builder.put(grammarAccess.getPresenceAccess().getGroup(), "rule__Presence__Group__0");
			builder.put(grammarAccess.getLeafAccess().getGroup(), "rule__Leaf__Group__0");
			builder.put(grammarAccess.getMandatoryAccess().getGroup(), "rule__Mandatory__Group__0");
			builder.put(grammarAccess.getLeafListAccess().getGroup(), "rule__LeafList__Group__0");
			builder.put(grammarAccess.getMinElementsAccess().getGroup(), "rule__MinElements__Group__0");
			builder.put(grammarAccess.getMaxElementsAccess().getGroup(), "rule__MaxElements__Group__0");
			builder.put(grammarAccess.getOrderedByAccess().getGroup(), "rule__OrderedBy__Group__0");
			builder.put(grammarAccess.getListAccess().getGroup(), "rule__List__Group__0");
			builder.put(grammarAccess.getKeyAccess().getGroup(), "rule__Key__Group__0");
			builder.put(grammarAccess.getUniqueAccess().getGroup(), "rule__Unique__Group__0");
			builder.put(grammarAccess.getChoiceAccess().getGroup(), "rule__Choice__Group__0");
			builder.put(grammarAccess.getCaseAccess().getGroup(), "rule__Case__Group__0");
			builder.put(grammarAccess.getAnydataAccess().getGroup(), "rule__Anydata__Group__0");
			builder.put(grammarAccess.getAnyxmlAccess().getGroup(), "rule__Anyxml__Group__0");
			builder.put(grammarAccess.getGroupingAccess().getGroup(), "rule__Grouping__Group__0");
			builder.put(grammarAccess.getUsesAccess().getGroup(), "rule__Uses__Group__0");
			builder.put(grammarAccess.getRefineAccess().getGroup(), "rule__Refine__Group__0");
			builder.put(grammarAccess.getRpcAccess().getGroup(), "rule__Rpc__Group__0");
			builder.put(grammarAccess.getInputAccess().getGroup(), "rule__Input__Group__0");
			builder.put(grammarAccess.getOutputAccess().getGroup(), "rule__Output__Group__0");
			builder.put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
			builder.put(grammarAccess.getNotificationAccess().getGroup(), "rule__Notification__Group__0");
			builder.put(grammarAccess.getAugmentAccess().getGroup(), "rule__Augment__Group__0");
			builder.put(grammarAccess.getIdentityAccess().getGroup(), "rule__Identity__Group__0");
			builder.put(grammarAccess.getBaseAccess().getGroup(), "rule__Base__Group__0");
			builder.put(grammarAccess.getExtensionAccess().getGroup(), "rule__Extension__Group__0");
			builder.put(grammarAccess.getArgumentAccess().getGroup(), "rule__Argument__Group__0");
			builder.put(grammarAccess.getYinElementAccess().getGroup(), "rule__YinElement__Group__0");
			builder.put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
			builder.put(grammarAccess.getIfFeatureAccess().getGroup(), "rule__IfFeature__Group__0");
			builder.put(grammarAccess.getIfFeatureOrExpressionAccess().getGroup(), "rule__IfFeatureOrExpression__Group__0");
			builder.put(grammarAccess.getIfFeatureOrExpressionAccess().getGroup_1(), "rule__IfFeatureOrExpression__Group_1__0");
			builder.put(grammarAccess.getIfFeatureAndExpressionAccess().getGroup(), "rule__IfFeatureAndExpression__Group__0");
			builder.put(grammarAccess.getIfFeatureAndExpressionAccess().getGroup_1(), "rule__IfFeatureAndExpression__Group_1__0");
			builder.put(grammarAccess.getIfFeatureExpressionAccess().getGroup_0(), "rule__IfFeatureExpression__Group_0__0");
			builder.put(grammarAccess.getIfFeatureExpressionAccess().getGroup_1(), "rule__IfFeatureExpression__Group_1__0");
			builder.put(grammarAccess.getIfFeatureExpressionAccess().getGroup_2(), "rule__IfFeatureExpression__Group_2__0");
			builder.put(grammarAccess.getDeviationAccess().getGroup(), "rule__Deviation__Group__0");
			builder.put(grammarAccess.getDeviateAccess().getGroup(), "rule__Deviate__Group__0");
			builder.put(grammarAccess.getConfigAccess().getGroup(), "rule__Config__Group__0");
			builder.put(grammarAccess.getStatusAccess().getGroup(), "rule__Status__Group__0");
			builder.put(grammarAccess.getDescriptionAccess().getGroup(), "rule__Description__Group__0");
			builder.put(grammarAccess.getReferenceAccess().getGroup(), "rule__Reference__Group__0");
			builder.put(grammarAccess.getWhenAccess().getGroup(), "rule__When__Group__0");
			builder.put(grammarAccess.getRangeAccess().getGroup(), "rule__Range__Group__0");
			builder.put(grammarAccess.getRefinementExpressionAccess().getGroup(), "rule__RefinementExpression__Group__0");
			builder.put(grammarAccess.getRefinementExpressionAccess().getGroup_1(), "rule__RefinementExpression__Group_1__0");
			builder.put(grammarAccess.getRangeRefinementExpressionAccess().getGroup(), "rule__RangeRefinementExpression__Group__0");
			builder.put(grammarAccess.getRangeRefinementExpressionAccess().getGroup_1(), "rule__RangeRefinementExpression__Group_1__0");
			builder.put(grammarAccess.getExplicitRefinementExpressionAccess().getGroup_0(), "rule__ExplicitRefinementExpression__Group_0__0");
			builder.put(grammarAccess.getExplicitRefinementExpressionAccess().getGroup_1(), "rule__ExplicitRefinementExpression__Group_1__0");
			builder.put(grammarAccess.getExplicitRefinementExpressionAccess().getGroup_2(), "rule__ExplicitRefinementExpression__Group_2__0");
			builder.put(grammarAccess.getFractionDigitsAccess().getGroup(), "rule__FractionDigits__Group__0");
			builder.put(grammarAccess.getLengthAccess().getGroup(), "rule__Length__Group__0");
			builder.put(grammarAccess.getPatternAccess().getGroup(), "rule__Pattern__Group__0");
			builder.put(grammarAccess.getModifierAccess().getGroup(), "rule__Modifier__Group__0");
			builder.put(grammarAccess.getEnumAccess().getGroup(), "rule__Enum__Group__0");
			builder.put(grammarAccess.getValueAccess().getGroup(), "rule__Value__Group__0");
			builder.put(grammarAccess.getBitAccess().getGroup(), "rule__Bit__Group__0");
			builder.put(grammarAccess.getPositionAccess().getGroup(), "rule__Position__Group__0");
			builder.put(grammarAccess.getPathAccess().getGroup(), "rule__Path__Group__0");
			builder.put(grammarAccess.getRequireInstanceAccess().getGroup(), "rule__RequireInstance__Group__0");
			builder.put(grammarAccess.getUnknownAccess().getGroup(), "rule__Unknown__Group__0");
			builder.put(grammarAccess.getDescendantSchemaNodeIdentifierAccess().getGroup(), "rule__DescendantSchemaNodeIdentifier__Group__0");
			builder.put(grammarAccess.getDescendantSchemaNodeIdentifierAccess().getGroup_1(), "rule__DescendantSchemaNodeIdentifier__Group_1__0");
			builder.put(grammarAccess.getSchemaNodeIdentifierAccess().getGroup(), "rule__SchemaNodeIdentifier__Group__0");
			builder.put(grammarAccess.getSchemaNodeIdentifierAccess().getGroup_1(), "rule__SchemaNodeIdentifier__Group_1__0");
			builder.put(grammarAccess.getRootSchemaNodeIdentifierAccess().getGroup(), "rule__RootSchemaNodeIdentifier__Group__0");
			builder.put(grammarAccess.getXpathExpressionAccess().getGroup_0(), "rule__XpathExpression__Group_0__0");
			builder.put(grammarAccess.getXpathOrExprAccess().getGroup(), "rule__XpathOrExpr__Group__0");
			builder.put(grammarAccess.getXpathOrExprAccess().getGroup_1(), "rule__XpathOrExpr__Group_1__0");
			builder.put(grammarAccess.getXpathAndExprAccess().getGroup(), "rule__XpathAndExpr__Group__0");
			builder.put(grammarAccess.getXpathAndExprAccess().getGroup_1(), "rule__XpathAndExpr__Group_1__0");
			builder.put(grammarAccess.getXpathEqualityExprAccess().getGroup(), "rule__XpathEqualityExpr__Group__0");
			builder.put(grammarAccess.getXpathEqualityExprAccess().getGroup_1(), "rule__XpathEqualityExpr__Group_1__0");
			builder.put(grammarAccess.getXpathRelationalExprAccess().getGroup(), "rule__XpathRelationalExpr__Group__0");
			builder.put(grammarAccess.getXpathRelationalExprAccess().getGroup_1(), "rule__XpathRelationalExpr__Group_1__0");
			builder.put(grammarAccess.getXpathAdditiveExprAccess().getGroup(), "rule__XpathAdditiveExpr__Group__0");
			builder.put(grammarAccess.getXpathAdditiveExprAccess().getGroup_1(), "rule__XpathAdditiveExpr__Group_1__0");
			builder.put(grammarAccess.getXpathMultiplicativeExprAccess().getGroup(), "rule__XpathMultiplicativeExpr__Group__0");
			builder.put(grammarAccess.getXpathMultiplicativeExprAccess().getGroup_1(), "rule__XpathMultiplicativeExpr__Group_1__0");
			builder.put(grammarAccess.getXpathUnaryExprAccess().getGroup_0(), "rule__XpathUnaryExpr__Group_0__0");
			builder.put(grammarAccess.getXpathUnionExprAccess().getGroup(), "rule__XpathUnionExpr__Group__0");
			builder.put(grammarAccess.getXpathUnionExprAccess().getGroup_1(), "rule__XpathUnionExpr__Group_1__0");
			builder.put(grammarAccess.getXpathPathExprAccess().getGroup(), "rule__XpathPathExpr__Group__0");
			builder.put(grammarAccess.getXpathPathExprAccess().getGroup_1(), "rule__XpathPathExpr__Group_1__0");
			builder.put(grammarAccess.getXpathPathExprAccess().getGroup_1_2(), "rule__XpathPathExpr__Group_1_2__0");
			builder.put(grammarAccess.getXpathPathExprAccess().getGroup_1_4(), "rule__XpathPathExpr__Group_1_4__0");
			builder.put(grammarAccess.getXpathFilterExprAccess().getGroup(), "rule__XpathFilterExpr__Group__0");
			builder.put(grammarAccess.getXpathFilterExprAccess().getGroup_1(), "rule__XpathFilterExpr__Group_1__0");
			builder.put(grammarAccess.getXpathPrimaryExprAccess().getGroup_0(), "rule__XpathPrimaryExpr__Group_0__0");
			builder.put(grammarAccess.getXpathPrimaryExprAccess().getGroup_1(), "rule__XpathPrimaryExpr__Group_1__0");
			builder.put(grammarAccess.getXpathPrimaryExprAccess().getGroup_2(), "rule__XpathPrimaryExpr__Group_2__0");
			builder.put(grammarAccess.getXpathPrimaryExprAccess().getGroup_3(), "rule__XpathPrimaryExpr__Group_3__0");
			builder.put(grammarAccess.getXpathPrimaryExprAccess().getGroup_4(), "rule__XpathPrimaryExpr__Group_4__0");
			builder.put(grammarAccess.getXpathPrimaryExprAccess().getGroup_4_3(), "rule__XpathPrimaryExpr__Group_4_3__0");
			builder.put(grammarAccess.getXpathPrimaryExprAccess().getGroup_4_3_1(), "rule__XpathPrimaryExpr__Group_4_3_1__0");
			builder.put(grammarAccess.getXpathPrimaryExprAccess().getGroup_5(), "rule__XpathPrimaryExpr__Group_5__0");
			builder.put(grammarAccess.getXpathPrimaryExprAccess().getGroup_6(), "rule__XpathPrimaryExpr__Group_6__0");
			builder.put(grammarAccess.getXpathPrimaryExprAccess().getGroup_6_2(), "rule__XpathPrimaryExpr__Group_6_2__0");
			builder.put(grammarAccess.getXpathStepAccess().getGroup_0(), "rule__XpathStep__Group_0__0");
			builder.put(grammarAccess.getXpathStepAccess().getGroup_1(), "rule__XpathStep__Group_1__0");
			builder.put(grammarAccess.getXpathStepAccess().getGroup_2(), "rule__XpathStep__Group_2__0");
			builder.put(grammarAccess.getXpathStepAccess().getGroup_3(), "rule__XpathStep__Group_3__0");
			builder.put(grammarAccess.getXpathStepAccess().getGroup_3_0(), "rule__XpathStep__Group_3_0__0");
			builder.put(grammarAccess.getXpathNodeTestAccess().getGroup_1(), "rule__XpathNodeTest__Group_1__0");
			builder.put(grammarAccess.getXpathNodeTestAccess().getGroup_2(), "rule__XpathNodeTest__Group_2__0");
			builder.put(grammarAccess.getXpathNameTestAccess().getGroup(), "rule__XpathNameTest__Group__0");
			builder.put(grammarAccess.getXpathNameTestAccess().getGroup_0(), "rule__XpathNameTest__Group_0__0");
			builder.put(grammarAccess.getQNAMEAccess().getGroup(), "rule__QNAME__Group__0");
			builder.put(grammarAccess.getQNAMEAccess().getGroup_0(), "rule__QNAME__Group_0__0");
			builder.put(grammarAccess.getQualifiedTypeNameAccess().getGroup(), "rule__QualifiedTypeName__Group__0");
			builder.put(grammarAccess.getQualifiedTypeNameAccess().getGroup_0(), "rule__QualifiedTypeName__Group_0__0");
			builder.put(grammarAccess.getStatementEndAccess().getSubstatementsAssignment_0_1(), "rule__StatementEnd__SubstatementsAssignment_0_1");
			builder.put(grammarAccess.getModuleAccess().getNameAssignment_1(), "rule__Module__NameAssignment_1");
			builder.put(grammarAccess.getYangVersionAccess().getYangVersionAssignment_1(), "rule__YangVersion__YangVersionAssignment_1");
			builder.put(grammarAccess.getNamespaceAccess().getUriAssignment_1(), "rule__Namespace__UriAssignment_1");
			builder.put(grammarAccess.getPrefixAccess().getPrefixAssignment_1(), "rule__Prefix__PrefixAssignment_1");
			builder.put(grammarAccess.getImportAccess().getModuleAssignment_1(), "rule__Import__ModuleAssignment_1");
			builder.put(grammarAccess.getRevisionDateAccess().getDateAssignment_1(), "rule__RevisionDate__DateAssignment_1");
			builder.put(grammarAccess.getIncludeAccess().getModuleAssignment_1(), "rule__Include__ModuleAssignment_1");
			builder.put(grammarAccess.getOrganizationAccess().getOrganizationAssignment_1(), "rule__Organization__OrganizationAssignment_1");
			builder.put(grammarAccess.getContactAccess().getContactAssignment_1(), "rule__Contact__ContactAssignment_1");
			builder.put(grammarAccess.getRevisionAccess().getRevisionAssignment_1(), "rule__Revision__RevisionAssignment_1");
			builder.put(grammarAccess.getSubmoduleAccess().getNameAssignment_1(), "rule__Submodule__NameAssignment_1");
			builder.put(grammarAccess.getBelongsToAccess().getModuleAssignment_1(), "rule__BelongsTo__ModuleAssignment_1");
			builder.put(grammarAccess.getTypedefAccess().getNameAssignment_1(), "rule__Typedef__NameAssignment_1");
			builder.put(grammarAccess.getUnitsAccess().getDefinitionAssignment_1(), "rule__Units__DefinitionAssignment_1");
			builder.put(grammarAccess.getDefaultAccess().getDefaultStringValueAssignment_1(), "rule__Default__DefaultStringValueAssignment_1");
			builder.put(grammarAccess.getTypeAccess().getTypeRefAssignment_1(), "rule__Type__TypeRefAssignment_1");
			builder.put(grammarAccess.getTypeReferenceAccess().getBuiltinAssignment_0(), "rule__TypeReference__BuiltinAssignment_0");
			builder.put(grammarAccess.getTypeReferenceAccess().getTypeAssignment_1(), "rule__TypeReference__TypeAssignment_1");
			builder.put(grammarAccess.getContainerAccess().getNameAssignment_1(), "rule__Container__NameAssignment_1");
			builder.put(grammarAccess.getMustAccess().getConstraintAssignment_1(), "rule__Must__ConstraintAssignment_1");
			builder.put(grammarAccess.getErrorMessageAccess().getMessageAssignment_1(), "rule__ErrorMessage__MessageAssignment_1");
			builder.put(grammarAccess.getErrorAppTagAccess().getTagAssignment_1(), "rule__ErrorAppTag__TagAssignment_1");
			builder.put(grammarAccess.getPresenceAccess().getDescriptionAssignment_1(), "rule__Presence__DescriptionAssignment_1");
			builder.put(grammarAccess.getLeafAccess().getNameAssignment_1(), "rule__Leaf__NameAssignment_1");
			builder.put(grammarAccess.getMandatoryAccess().getIsMandatoryAssignment_1(), "rule__Mandatory__IsMandatoryAssignment_1");
			builder.put(grammarAccess.getLeafListAccess().getNameAssignment_1(), "rule__LeafList__NameAssignment_1");
			builder.put(grammarAccess.getMinElementsAccess().getMinElementsAssignment_1(), "rule__MinElements__MinElementsAssignment_1");
			builder.put(grammarAccess.getMaxElementsAccess().getMaxElementsAssignment_1(), "rule__MaxElements__MaxElementsAssignment_1");
			builder.put(grammarAccess.getOrderedByAccess().getOrderedByAssignment_1(), "rule__OrderedBy__OrderedByAssignment_1");
			builder.put(grammarAccess.getListAccess().getNameAssignment_1(), "rule__List__NameAssignment_1");
			builder.put(grammarAccess.getKeyAccess().getReferencesAssignment_2(), "rule__Key__ReferencesAssignment_2");
			builder.put(grammarAccess.getKeyReferenceAccess().getNodeAssignment(), "rule__KeyReference__NodeAssignment");
			builder.put(grammarAccess.getDescendantSchemaNodeIdentifierReferencesAccess().getReferencesAssignment(), "rule__DescendantSchemaNodeIdentifierReferences__ReferencesAssignment");
			builder.put(grammarAccess.getChoiceAccess().getNameAssignment_1(), "rule__Choice__NameAssignment_1");
			builder.put(grammarAccess.getCaseAccess().getNameAssignment_1(), "rule__Case__NameAssignment_1");
			builder.put(grammarAccess.getAnydataAccess().getNameAssignment_1(), "rule__Anydata__NameAssignment_1");
			builder.put(grammarAccess.getAnyxmlAccess().getNameAssignment_1(), "rule__Anyxml__NameAssignment_1");
			builder.put(grammarAccess.getGroupingAccess().getNameAssignment_1(), "rule__Grouping__NameAssignment_1");
			builder.put(grammarAccess.getUsesAccess().getGroupingAssignment_1(), "rule__Uses__GroupingAssignment_1");
			builder.put(grammarAccess.getRefineAccess().getNodeAssignment_1(), "rule__Refine__NodeAssignment_1");
			builder.put(grammarAccess.getRpcAccess().getNameAssignment_1(), "rule__Rpc__NameAssignment_1");
			builder.put(grammarAccess.getInputAccess().getNameAssignment_2(), "rule__Input__NameAssignment_2");
			builder.put(grammarAccess.getOutputAccess().getNameAssignment_2(), "rule__Output__NameAssignment_2");
			builder.put(grammarAccess.getActionAccess().getNameAssignment_1(), "rule__Action__NameAssignment_1");
			builder.put(grammarAccess.getNotificationAccess().getNameAssignment_1(), "rule__Notification__NameAssignment_1");
			builder.put(grammarAccess.getAugmentAccess().getPathAssignment_1(), "rule__Augment__PathAssignment_1");
			builder.put(grammarAccess.getIdentityAccess().getNameAssignment_1(), "rule__Identity__NameAssignment_1");
			builder.put(grammarAccess.getBaseAccess().getReferenceAssignment_1(), "rule__Base__ReferenceAssignment_1");
			builder.put(grammarAccess.getExtensionAccess().getNameAssignment_1(), "rule__Extension__NameAssignment_1");
			builder.put(grammarAccess.getArgumentAccess().getNameAssignment_1(), "rule__Argument__NameAssignment_1");
			builder.put(grammarAccess.getYinElementAccess().getIsYinElementAssignment_1(), "rule__YinElement__IsYinElementAssignment_1");
			builder.put(grammarAccess.getFeatureAccess().getNameAssignment_1(), "rule__Feature__NameAssignment_1");
			builder.put(grammarAccess.getIfFeatureAccess().getConditionAssignment_1(), "rule__IfFeature__ConditionAssignment_1");
			builder.put(grammarAccess.getIfFeatureOrExpressionAccess().getOperatorAssignment_1_1(), "rule__IfFeatureOrExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getIfFeatureOrExpressionAccess().getRightAssignment_1_2(), "rule__IfFeatureOrExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getIfFeatureAndExpressionAccess().getOperatorAssignment_1_1(), "rule__IfFeatureAndExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getIfFeatureAndExpressionAccess().getRightAssignment_1_2(), "rule__IfFeatureAndExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getIfFeatureExpressionAccess().getFeatureAssignment_0_1(), "rule__IfFeatureExpression__FeatureAssignment_0_1");
			builder.put(grammarAccess.getIfFeatureExpressionAccess().getOperatorAssignment_1_1(), "rule__IfFeatureExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getIfFeatureExpressionAccess().getTargetAssignment_1_2(), "rule__IfFeatureExpression__TargetAssignment_1_2");
			builder.put(grammarAccess.getDeviationAccess().getReferenceAssignment_1(), "rule__Deviation__ReferenceAssignment_1");
			builder.put(grammarAccess.getDeviateAccess().getArgumentAssignment_1(), "rule__Deviate__ArgumentAssignment_1");
			builder.put(grammarAccess.getConfigAccess().getIsConfigAssignment_1(), "rule__Config__IsConfigAssignment_1");
			builder.put(grammarAccess.getStatusAccess().getArgumentAssignment_1(), "rule__Status__ArgumentAssignment_1");
			builder.put(grammarAccess.getDescriptionAccess().getDescriptionAssignment_1(), "rule__Description__DescriptionAssignment_1");
			builder.put(grammarAccess.getReferenceAccess().getReferenceAssignment_1(), "rule__Reference__ReferenceAssignment_1");
			builder.put(grammarAccess.getWhenAccess().getConditionAssignment_1(), "rule__When__ConditionAssignment_1");
			builder.put(grammarAccess.getRangeAccess().getExpressionAssignment_1(), "rule__Range__ExpressionAssignment_1");
			builder.put(grammarAccess.getRefinementExpressionAccess().getOperatorAssignment_1_1(), "rule__RefinementExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getRefinementExpressionAccess().getRightAssignment_1_2(), "rule__RefinementExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getRangeRefinementExpressionAccess().getOperatorAssignment_1_1(), "rule__RangeRefinementExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getRangeRefinementExpressionAccess().getRightAssignment_1_2(), "rule__RangeRefinementExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getExplicitRefinementExpressionAccess().getValueAssignment_0_1(), "rule__ExplicitRefinementExpression__ValueAssignment_0_1");
			builder.put(grammarAccess.getFractionDigitsAccess().getRangeAssignment_1(), "rule__FractionDigits__RangeAssignment_1");
			builder.put(grammarAccess.getLengthAccess().getExpressionAssignment_1(), "rule__Length__ExpressionAssignment_1");
			builder.put(grammarAccess.getPatternAccess().getRegexpAssignment_1(), "rule__Pattern__RegexpAssignment_1");
			builder.put(grammarAccess.getModifierAccess().getModifierAssignment_1(), "rule__Modifier__ModifierAssignment_1");
			builder.put(grammarAccess.getEnumAccess().getNameAssignment_1(), "rule__Enum__NameAssignment_1");
			builder.put(grammarAccess.getValueAccess().getOrdinalAssignment_1(), "rule__Value__OrdinalAssignment_1");
			builder.put(grammarAccess.getBitAccess().getNameAssignment_1(), "rule__Bit__NameAssignment_1");
			builder.put(grammarAccess.getPositionAccess().getOrdinalAssignment_1(), "rule__Position__OrdinalAssignment_1");
			builder.put(grammarAccess.getPathAccess().getReferenceAssignment_1(), "rule__Path__ReferenceAssignment_1");
			builder.put(grammarAccess.getRequireInstanceAccess().getIsRequireInstanceAssignment_1(), "rule__RequireInstance__IsRequireInstanceAssignment_1");
			builder.put(grammarAccess.getUnknownAccess().getExtensionAssignment_0(), "rule__Unknown__ExtensionAssignment_0");
			builder.put(grammarAccess.getUnknownAccess().getNameAssignment_1(), "rule__Unknown__NameAssignment_1");
			builder.put(grammarAccess.getDescendantSchemaNodeIdentifierAccess().getSchemaNodeAssignment_1_2(), "rule__DescendantSchemaNodeIdentifier__SchemaNodeAssignment_1_2");
			builder.put(grammarAccess.getDescendantRootSchemaNodeIdentifierAccess().getSchemaNodeAssignment(), "rule__DescendantRootSchemaNodeIdentifier__SchemaNodeAssignment");
			builder.put(grammarAccess.getSchemaNodeIdentifierAccess().getSchemaNodeAssignment_1_2(), "rule__SchemaNodeIdentifier__SchemaNodeAssignment_1_2");
			builder.put(grammarAccess.getRootSchemaNodeIdentifierAccess().getIsAbsoluteAssignment_0(), "rule__RootSchemaNodeIdentifier__IsAbsoluteAssignment_0");
			builder.put(grammarAccess.getRootSchemaNodeIdentifierAccess().getSchemaNodeAssignment_1(), "rule__RootSchemaNodeIdentifier__SchemaNodeAssignment_1");
			builder.put(grammarAccess.getGroupingRefAccess().getNodeAssignment(), "rule__GroupingRef__NodeAssignment");
			builder.put(grammarAccess.getXpathExpressionAccess().getTextAssignment_0_2(), "rule__XpathExpression__TextAssignment_0_2");
			builder.put(grammarAccess.getXpathOrExprAccess().getOperatorAssignment_1_1(), "rule__XpathOrExpr__OperatorAssignment_1_1");
			builder.put(grammarAccess.getXpathOrExprAccess().getRightAssignment_1_2(), "rule__XpathOrExpr__RightAssignment_1_2");
			builder.put(grammarAccess.getXpathAndExprAccess().getOperatorAssignment_1_1(), "rule__XpathAndExpr__OperatorAssignment_1_1");
			builder.put(grammarAccess.getXpathAndExprAccess().getRightAssignment_1_2(), "rule__XpathAndExpr__RightAssignment_1_2");
			builder.put(grammarAccess.getXpathEqualityExprAccess().getOperatorAssignment_1_1(), "rule__XpathEqualityExpr__OperatorAssignment_1_1");
			builder.put(grammarAccess.getXpathEqualityExprAccess().getRightAssignment_1_2(), "rule__XpathEqualityExpr__RightAssignment_1_2");
			builder.put(grammarAccess.getXpathRelationalExprAccess().getOperatorAssignment_1_1(), "rule__XpathRelationalExpr__OperatorAssignment_1_1");
			builder.put(grammarAccess.getXpathRelationalExprAccess().getRightAssignment_1_2(), "rule__XpathRelationalExpr__RightAssignment_1_2");
			builder.put(grammarAccess.getXpathAdditiveExprAccess().getOperatorAssignment_1_1(), "rule__XpathAdditiveExpr__OperatorAssignment_1_1");
			builder.put(grammarAccess.getXpathAdditiveExprAccess().getRightAssignment_1_2(), "rule__XpathAdditiveExpr__RightAssignment_1_2");
			builder.put(grammarAccess.getXpathMultiplicativeExprAccess().getOperatorAssignment_1_1(), "rule__XpathMultiplicativeExpr__OperatorAssignment_1_1");
			builder.put(grammarAccess.getXpathMultiplicativeExprAccess().getRightAssignment_1_2(), "rule__XpathMultiplicativeExpr__RightAssignment_1_2");
			builder.put(grammarAccess.getXpathUnaryExprAccess().getOperatorAssignment_0_1(), "rule__XpathUnaryExpr__OperatorAssignment_0_1");
			builder.put(grammarAccess.getXpathUnaryExprAccess().getTargetAssignment_0_2(), "rule__XpathUnaryExpr__TargetAssignment_0_2");
			builder.put(grammarAccess.getXpathUnionExprAccess().getOperatorAssignment_1_1(), "rule__XpathUnionExpr__OperatorAssignment_1_1");
			builder.put(grammarAccess.getXpathUnionExprAccess().getRightAssignment_1_2(), "rule__XpathUnionExpr__RightAssignment_1_2");
			builder.put(grammarAccess.getXpathPathExprAccess().getIsDescendantsAssignment_1_2_0(), "rule__XpathPathExpr__IsDescendantsAssignment_1_2_0");
			builder.put(grammarAccess.getXpathPathExprAccess().getStepAssignment_1_3(), "rule__XpathPathExpr__StepAssignment_1_3");
			builder.put(grammarAccess.getXpathPathExprAccess().getPredicateAssignment_1_4_2(), "rule__XpathPathExpr__PredicateAssignment_1_4_2");
			builder.put(grammarAccess.getXpathFilterExprAccess().getPredicateAssignment_1_2(), "rule__XpathFilterExpr__PredicateAssignment_1_2");
			builder.put(grammarAccess.getXpathPrimaryExprAccess().getNameAssignment_0_2(), "rule__XpathPrimaryExpr__NameAssignment_0_2");
			builder.put(grammarAccess.getXpathPrimaryExprAccess().getValueAssignment_2_1(), "rule__XpathPrimaryExpr__ValueAssignment_2_1");
			builder.put(grammarAccess.getXpathPrimaryExprAccess().getValueAssignment_3_1(), "rule__XpathPrimaryExpr__ValueAssignment_3_1");
			builder.put(grammarAccess.getXpathPrimaryExprAccess().getNameAssignment_4_1(), "rule__XpathPrimaryExpr__NameAssignment_4_1");
			builder.put(grammarAccess.getXpathPrimaryExprAccess().getArgsAssignment_4_3_0(), "rule__XpathPrimaryExpr__ArgsAssignment_4_3_0");
			builder.put(grammarAccess.getXpathPrimaryExprAccess().getArgsAssignment_4_3_1_1(), "rule__XpathPrimaryExpr__ArgsAssignment_4_3_1_1");
			builder.put(grammarAccess.getXpathPrimaryExprAccess().getStepAssignment_5_1(), "rule__XpathPrimaryExpr__StepAssignment_5_1");
			builder.put(grammarAccess.getXpathPrimaryExprAccess().getIsDescendantsAssignment_6_2_0(), "rule__XpathPrimaryExpr__IsDescendantsAssignment_6_2_0");
			builder.put(grammarAccess.getXpathPrimaryExprAccess().getStepAssignment_6_3(), "rule__XpathPrimaryExpr__StepAssignment_6_3");
			builder.put(grammarAccess.getXpathStepAccess().getRefAssignment_0_1(), "rule__XpathStep__RefAssignment_0_1");
			builder.put(grammarAccess.getXpathStepAccess().getRefAssignment_1_1(), "rule__XpathStep__RefAssignment_1_1");
			builder.put(grammarAccess.getXpathStepAccess().getAttributeNameAssignment_2_2(), "rule__XpathStep__AttributeNameAssignment_2_2");
			builder.put(grammarAccess.getXpathStepAccess().getAxisAssignment_3_0_0(), "rule__XpathStep__AxisAssignment_3_0_0");
			builder.put(grammarAccess.getXpathStepAccess().getNodeAssignment_3_1(), "rule__XpathStep__NodeAssignment_3_1");
			builder.put(grammarAccess.getXpathNodeTestAccess().getNameAssignment_1_1(), "rule__XpathNodeTest__NameAssignment_1_1");
			builder.put(grammarAccess.getXpathNodeTestAccess().getInstructionAssignment_2_3(), "rule__XpathNodeTest__InstructionAssignment_2_3");
			builder.put(grammarAccess.getXpathNameTestAccess().getPrefixAssignment_0_0(), "rule__XpathNameTest__PrefixAssignment_0_0");
			builder.put(grammarAccess.getXpathNameTestAccess().getRefAssignment_1(), "rule__XpathNameTest__RefAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private YangGrammarAccess grammarAccess;

	@Override
	protected InternalYangParser createParser() {
		InternalYangParser result = new InternalYangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_HIDDEN" };
	}

	public YangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(YangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
