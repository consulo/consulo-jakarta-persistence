/**
 * @author VISTALL
 * @since 2026-05-07
 */
module consulo.jakarta.persistence {
    requires consulo.application.api;

    requires consulo.jakarta.persistence.api;
    requires consulo.sql.language.api;
    requires consulo.java.language.api;

    requires consulo.jakarta.persistence.database.api;
}