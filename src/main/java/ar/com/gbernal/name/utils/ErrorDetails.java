package ar.com.gbernal.name.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Generated;

import javax.validation.constraints.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"code", "description", "field", "value", "location"})
public class ErrorDetails {
    @NotNull
    private ApplicationErrorCode code;
    @NotNull
    private String description;
    private String field;
    private Object value;
    private Location location;

    @Generated
    public static ErrorDetails.ErrorDetailsBuilder builder() {
        return new ErrorDetails.ErrorDetailsBuilder();
    }

    @Generated
    public ApplicationErrorCode getCode() {
        return this.code;
    }

    @Generated
    public String getDescription() {
        return this.description;
    }

    @Generated
    public String getField() {
        return this.field;
    }

    @Generated
    public Object getValue() {
        return this.value;
    }

    @Generated
    public Location getLocation() {
        return this.location;
    }

    @Generated
    public void setCode(ApplicationErrorCode code) {
        this.code = code;
    }

    @Generated
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated
    public void setField(String field) {
        this.field = field;
    }

    @Generated
    public void setValue(Object value) {
        this.value = value;
    }

    @Generated
    public void setLocation(Location location) {
        this.location = location;
    }

    @Generated
    public String toString() {
        ApplicationErrorCode var10000 = this.getCode();
        return "ErrorDetails(code=" + var10000 + ", description=" + this.getDescription() + ", field=" + this.getField() + ", value=" + this.getValue() + ", location=" + this.getLocation() + ")";
    }

    @Generated
    public ErrorDetails(ApplicationErrorCode code, String description, String field, Object value, Location location) {
        this.code = code;
        this.description = description;
        this.field = field;
        this.value = value;
        this.location = location;
    }

    @Generated
    public ErrorDetails() {
    }

    @Generated
    public static class ErrorDetailsBuilder {
        @Generated
        private ApplicationErrorCode code;
        @Generated
        private String description;
        @Generated
        private String field;
        @Generated
        private Object value;
        @Generated
        private Location location;

        @Generated
        ErrorDetailsBuilder() {
        }

        @Generated
        public ErrorDetails.ErrorDetailsBuilder code(ApplicationErrorCode code) {
            this.code = code;
            return this;
        }

        @Generated
        public ErrorDetails.ErrorDetailsBuilder description(String description) {
            this.description = description;
            return this;
        }

        @Generated
        public ErrorDetails.ErrorDetailsBuilder field(String field) {
            this.field = field;
            return this;
        }

        @Generated
        public ErrorDetails.ErrorDetailsBuilder value(Object value) {
            this.value = value;
            return this;
        }

        @Generated
        public ErrorDetails.ErrorDetailsBuilder location(Location location) {
            this.location = location;
            return this;
        }

        @Generated
        public ErrorDetails build() {
            return new ErrorDetails(this.code, this.description, this.field, this.value, this.location);
        }

        @Generated
        public String toString() {
            return "ErrorDetails.ErrorDetailsBuilder(code=" + this.code + ", description=" + this.description + ", field=" + this.field + ", value=" + this.value + ", location=" + this.location + ")";
        }
    }
}
