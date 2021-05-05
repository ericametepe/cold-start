
keycloak:
  bearer-only: true
  realm: andriveau
  auth-server-url: http://localhost:8181/auth
  resource: api-gen
  credentials:
    secret: 6a21812d-0f2b-4c9f-926d-01def53ecb1f
  use-resource-role-mappings: true
management:
  endpoints:
    enabled-by-default: true
    jmx:
      exposure:
        include: "health,info"
    web:
      exposure:
        include: "*"
  endpoint:
    info:
      enabled: true
    metrics:
      enabled: true
    health:
      probes:
        enabled: true
    prometheus:
      enabled: true
