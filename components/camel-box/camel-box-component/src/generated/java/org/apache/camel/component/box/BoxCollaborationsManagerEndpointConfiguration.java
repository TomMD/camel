
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.box;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for org.apache.camel.component.box.api.BoxCollaborationsManager
 */
@ApiParams(apiName = "collaborations", apiMethods = "addFolderCollaboration,addFolderCollaborationByEmail,deleteCollaboration,getCollaborationInfo,getFolderCollaborations,getPendingCollaborations,updateCollaborationInfo")
@UriParams
@Configurer
public final class BoxCollaborationsManagerEndpointConfiguration extends BoxConfiguration {
    @UriParam(description = "The id of comment to change")
    private String collaborationId;
    @UriParam(description = "The collaborator to add")
    private com.box.sdk.BoxCollaborator collaborator;
    @UriParam(description = "The email address of the collaborator to add")
    private String email;
    @UriParam(description = "The id of folder to add collaboration to")
    private String folderId;
    @UriParam
    private com.box.sdk.BoxCollaboration.Info info;
    @UriParam(description = "The role of the collaborator")
    private com.box.sdk.BoxCollaboration.Role role;

    public String getCollaborationId() {
        return collaborationId;
    }

    public void setCollaborationId(String collaborationId) {
        this.collaborationId = collaborationId;
    }

    public com.box.sdk.BoxCollaborator getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(com.box.sdk.BoxCollaborator collaborator) {
        this.collaborator = collaborator;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public com.box.sdk.BoxCollaboration.Info getInfo() {
        return info;
    }

    public void setInfo(com.box.sdk.BoxCollaboration.Info info) {
        this.info = info;
    }

    public com.box.sdk.BoxCollaboration.Role getRole() {
        return role;
    }

    public void setRole(com.box.sdk.BoxCollaboration.Role role) {
        this.role = role;
    }
}
