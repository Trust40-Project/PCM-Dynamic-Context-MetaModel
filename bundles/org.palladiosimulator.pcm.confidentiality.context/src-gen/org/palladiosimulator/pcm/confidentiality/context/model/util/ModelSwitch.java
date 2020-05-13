/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.pcm.confidentiality.context.model.*;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ModelPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelSwitch() {
        if (modelPackage == null) {
            modelPackage = ModelPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case ModelPackage.HIERACHICAL_CONTEXT: {
            HierachicalContext hierachicalContext = (HierachicalContext) theEObject;
            T result = caseHierachicalContext(hierachicalContext);
            if (result == null)
                result = caseContextAttribute(hierachicalContext);
            if (result == null)
                result = caseEntity(hierachicalContext);
            if (result == null)
                result = caseIdentifier(hierachicalContext);
            if (result == null)
                result = caseNamedElement(hierachicalContext);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModelPackage.SINGLE_ATTRIBUTE_CONTEXT: {
            SingleAttributeContext singleAttributeContext = (SingleAttributeContext) theEObject;
            T result = caseSingleAttributeContext(singleAttributeContext);
            if (result == null)
                result = caseContextAttribute(singleAttributeContext);
            if (result == null)
                result = caseEntity(singleAttributeContext);
            if (result == null)
                result = caseIdentifier(singleAttributeContext);
            if (result == null)
                result = caseNamedElement(singleAttributeContext);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModelPackage.RELATED_CONTEXT_SET: {
            RelatedContextSet relatedContextSet = (RelatedContextSet) theEObject;
            T result = caseRelatedContextSet(relatedContextSet);
            if (result == null)
                result = caseContextAttribute(relatedContextSet);
            if (result == null)
                result = caseEntity(relatedContextSet);
            if (result == null)
                result = caseIdentifier(relatedContextSet);
            if (result == null)
                result = caseNamedElement(relatedContextSet);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModelPackage.CONTEXT_ATTRIBUTE: {
            ContextAttribute contextAttribute = (ContextAttribute) theEObject;
            T result = caseContextAttribute(contextAttribute);
            if (result == null)
                result = caseEntity(contextAttribute);
            if (result == null)
                result = caseIdentifier(contextAttribute);
            if (result == null)
                result = caseNamedElement(contextAttribute);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModelPackage.CONTEXT: {
            Context context = (Context) theEObject;
            T result = caseContext(context);
            if (result == null)
                result = caseEntity(context);
            if (result == null)
                result = caseIdentifier(context);
            if (result == null)
                result = caseNamedElement(context);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hierachical Context</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hierachical Context</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHierachicalContext(HierachicalContext object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Single Attribute Context</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Single Attribute Context</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSingleAttributeContext(SingleAttributeContext object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Related Context Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Related Context Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelatedContextSet(RelatedContextSet object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContextAttribute(ContextAttribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContext(Context object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier(Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(NamedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntity(Entity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //ModelSwitch
