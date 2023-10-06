package org.nixos.gradle2nix.dependencygraph.model

import kotlinx.serialization.Serializable

/**
 * The source of a dependency declaration, representing where the direct dependency is declared,
 * or where the parent dependency is declared for transitive dependencies.
 * In most cases, this will be the project component that declares the dependency,
 * but may also be a Version Catalog or the build as a whole.
 * We attempt to map this to an actual source file location when building a dependency report.
 */
@Serializable
data class DependencySource(val id: String, val path: String)
