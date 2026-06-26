class Codec {
public:

    string serialize(TreeNode* root)
    {
        if(root == nullptr)
        {
            return "#,";
        }

        return to_string(root->val) + "," +
               serialize(root->left) +
               serialize(root->right);
    }

    TreeNode* buildTree(stringstream &ss)
    {
        string value;

        getline(ss, value, ',');

        if(value == "#")
        {
            return nullptr;
        }

        TreeNode* root = new TreeNode(stoi(value));

        root->left = buildTree(ss);
        root->right = buildTree(ss);

        return root;
    }

    TreeNode* deserialize(string data)
    {
        stringstream ss(data);

        return buildTree(ss);
    }
};