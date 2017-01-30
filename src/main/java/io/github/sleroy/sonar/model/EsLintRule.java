package io.github.sleroy.sonar.model;

import org.sonar.api.server.debt.DebtRemediationFunction;

public class EsLintRule {
    public final String key;
    public final String name;
    public final String severity;
    public final String htmlDescription;

    public boolean hasDebtRemediation;
    public final DebtRemediationFunction.Type debtRemediationFunction;
    public final String debtRemediationScalar;
    public final String debtRemediationOffset;
    public final String debtType;

    public EsLintRule(
        String key,
        String severity,
        String name,
        String htmlDescription
    ) {
        this.key = key;
        this.severity = severity;
        this.name = name;
        this.htmlDescription = htmlDescription;

        this.debtRemediationFunction = DebtRemediationFunction.Type.CONSTANT_ISSUE;
        this.debtRemediationScalar = "0min";
        this.debtRemediationOffset = "0min";
        this.debtType = null;
    }

    public EsLintRule(
        String key,
        String severity,
        String name,
        String htmlDescription,
        DebtRemediationFunction.Type debtRemediationFunction,
        String debtRemediationScalar,
        String debtRemediationOffset,
        String debtType
    ) {
        this.key = key;
        this.severity = severity;
        this.name = name;
        this.htmlDescription = htmlDescription;

        this.hasDebtRemediation = true;
        this.debtRemediationFunction = debtRemediationFunction;
        this.debtRemediationScalar = debtRemediationScalar;
        this.debtRemediationOffset = debtRemediationOffset;
        this.debtType = debtType;
    }
}
