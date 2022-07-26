# Contributing

Thank you for considering contributing to GW2APIClient!

We welcome any type of contribution, regardless of whether it's code,
documentation, or a bug report.

Any contribution must be submitted as a pull request. (If you wish to report an
issue or ask a question please use the [issue tracker](https://github.com/GW2ToolBelt/GW2APIClient/issues)
or [discussions](https://github.com/GW2ToolBelt/GW2APIClient/discussions) instead.)


## General Guidelines

The bigger the pull request, the longer it will take to review and merge. Try to
break down pull requests in smaller chunks that are logical self-contained
changes.

This project does not strictly follow any public formatting guidelines we could
link here, but we ask you to stick to the formatting used when possible.


## Contributing Code

A large part of this project's source code is generated. The code generation
logic resides in `generator` the directory.

To understand the generator, it is recommended to check out the [api-generator](https://github.com/GW2ToolBelt/api-generator)
(which provides the necessary data) first.

Keep in mind, that the handwritten code should merely serve as a framework for
the generated requests.

### Contributing Endpoints

Endpoints and queries are generated from the definitions provided by the [api-generator](https://github.com/GW2ToolBelt/api-generator).
Please visit the api-generator repository and issue tracker to
request/contribute changes to or additions of endpoints.


## Contributing Documentation

If you are contributing documentation on how to use this project, please
describe why you think these improvements are necessary.