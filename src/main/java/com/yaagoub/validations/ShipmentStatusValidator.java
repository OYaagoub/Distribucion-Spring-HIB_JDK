package com.yaagoub.validations;

import jakarta.validation.*;
import jakarta.validation.constraints.NotNull;

import java.lang.annotation.*;

// Define that the annotation can be applied to fields and parameters
/*
    @Target: Specifies where the annotation can be applied (in this case, on fields and parameters).
    @Retention: Specifies when the annotation should be retained (in this case, at runtime).
    @Documented: Indicates that the annotation should be documented in the generated JavaDoc.
    @NotNull: Part of the Jakarta Validation API, specifies that the annotated element must not be null.
    @ReportAsSingleViolation: Specifies that a constraint violation on a composing constraint should be reported as a single violation.
    @Constraint: Links the annotation to a validation constraint (specified by validatedBy attribute).

*/
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@NotNull(message = "Customer type cannot be null")
@ReportAsSingleViolation
@Constraint(validatedBy = ShipmentStatusValidator.CustomerTypeValidator.class)
public @interface ShipmentStatusValidator {
    /*
    message(): Specifies the default error message for invalid customer types.
    groups(): Specifies default validation groups.
    payload(): Specifies default payload.حمولة
     */

    String message() default "Invalid Status type Shipment";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    class CustomerTypeValidator implements ConstraintValidator<ShipmentStatusValidator, String> {
        @Override
        public boolean isValid(String value, ConstraintValidatorContext context) {
            if (value == null) {
                return false;
            }

            return value.equals(Status.SANDED.name()) ||
                    value.equals(Status.SAVED.name()) ||
                    value.equals(Status.CONFIRMED.name()) ||
                    value.equals(Status.REPORTED.name());

        }
        enum  Status {
            SANDED,
            SAVED,
            CONFIRMED,
            REPORTED
        }
    }
}

