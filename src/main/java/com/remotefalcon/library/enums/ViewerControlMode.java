package com.remotefalcon.library.enums;

import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.graphql.Type;

@Type
@RequiredArgsConstructor
public enum ViewerControlMode {
  JUKEBOX("jukebox"),
  VOTING("voting");

  @SuppressWarnings("unused")
  private final String viewerControlMode;
}
